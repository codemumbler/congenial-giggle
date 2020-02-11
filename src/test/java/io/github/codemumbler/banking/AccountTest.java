package io.github.codemumbler.banking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

  public static final long FEB_8_2020 = 1581217528L;
  private Amount oneHundred;
  private Account account;

  @BeforeEach
  public void setUp() {
    account = new Account();
    BankClock.setInstance(new BankClock() {
      private int count = 0;
      @Override
      public Instant currentTime() {
        count++;
        if (count <= 1) {
          return Instant.ofEpochSecond(1581111111L);
        }
        return Instant.ofEpochSecond(FEB_8_2020);
      }
    });
    oneHundred = new Amount(100.0);
  }

  @AfterEach
  public void tearDown() {
    BankClock.setInstance(null);
  }

  @Test
  public void deposit() {
    doDeposit();
    assertEquals(100.0, account.balance());
  }

  private void doDeposit() {
    account.deposit(oneHundred);
  }

  @Test
  public void noTransactions() {
    assertEquals(0.0, account.balance());
  }

  @Test
  public void twoDeposits() {
    doDeposit();
    doDeposit();
    assertEquals(200.0, account.balance());
  }

  @Test
  public void withdrawl() {
    doDepositAndWithdrawl();
    assertEquals(75.0, account.balance());
  }

  @Test
  public void printStatement() {
    doDeposit();
    assertEquals("Date\tAmount\tBalance"
        + System.lineSeparator()
        + "02/07/2020\t$100.00\t$100.00"
        + System.lineSeparator(),
        account.printStatement());
  }

  @Test
  public void printStatementForDualTransaction() {
    doDepositAndWithdrawl();
    assertEquals("Date\tAmount\tBalance"
            + System.lineSeparator()
            + "02/07/2020\t$100.00\t$100.00"
            + System.lineSeparator()
            + "02/08/2020\t($25.00)\t$75.00"
            + System.lineSeparator(),
        account.printStatement());
  }

  private void doDepositAndWithdrawl() {
    doDeposit();
    account.withdrawl(new Amount(25d));
  }

  @Test
  public void printOnlyDeposits() {
    doDepositAndWithdrawl();

    PrintFilter filter = PrintFilter.builder().includeDeposits().build();

    assertEquals("Date\tAmount\tBalance"
            + System.lineSeparator()
            + "02/07/2020\t$100.00\t$100.00"
            + System.lineSeparator(),
        account.printStatement(filter));
  }

  @Test
  public void printOnlyWithdrawls() {
    doDepositAndWithdrawl();

    PrintFilter filter = PrintFilter.builder().includeWithdrawls().build();

    assertEquals("Date\tAmount\tBalance"
            + System.lineSeparator()
            + "02/08/2020\t($25.00)\t$75.00"
            + System.lineSeparator(),
        account.printStatement(filter));
  }

  @Test
  public void printBeforeDate() {
    doDepositAndWithdrawl();
    PrintFilter filter = PrintFilter.builder().before(Instant.ofEpochSecond(FEB_8_2020 - 1L)).build();

    assertEquals("Date\tAmount\tBalance"
            + System.lineSeparator()
            + "02/07/2020\t$100.00\t$100.00"
            + System.lineSeparator(),
        account.printStatement(filter));
  }

  @Test
  public void printAfterDate() {
    doDepositAndWithdrawl();
    PrintFilter filter = PrintFilter.builder().after(Instant.ofEpochSecond(FEB_8_2020 - 1L)).build();

    assertEquals("Date\tAmount\tBalance"
            + System.lineSeparator()
            + "02/08/2020\t($25.00)\t$75.00"
            + System.lineSeparator(),
        account.printStatement(filter));
  }
}
