package io.github.codemumbler.banking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

  private Amount oneHundred;
  private Account account;

  @BeforeEach
  public void setUp() {
    account = new Account();
    BankClock.setInstance(new BankClock() {

      @Override
      public Instant currentTime() {
        return Instant.ofEpochSecond(1581217528L);
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
    account.deposit(oneHundred);
    assertEquals(100.0, account.balance());
  }

  @Test
  public void noTransactions() {
    assertEquals(0.0, account.balance());
  }

  @Test
  public void twoDeposits() {
    account.deposit(oneHundred);
    account.deposit(oneHundred);
    assertEquals(200.0, account.balance());
  }

  @Test
  public void withdrawl() {
    account.deposit(oneHundred);
    account.withdrawl(oneHundred);
    assertEquals(0.0, account.balance());
  }

  @Test
  public void printStatement() {
    account.deposit(oneHundred);
    assertEquals("Date\tAmount\tBalance"
        + System.lineSeparator()
        + "02/08/2020\t$100.00\t$100.00"
        + System.lineSeparator(),
        account.printStatement());
  }

  @Test
  public void printStatementForDualTransaction() {
    account.deposit(oneHundred);
    account.withdrawl(new Amount(25d));
    assertEquals("Date\tAmount\tBalance"
            + System.lineSeparator()
            + "02/08/2020\t$100.00\t$100.00"
            + System.lineSeparator()
            + "02/08/2020\t($25.00)\t$75.00"
            + System.lineSeparator(),
        account.printStatement());
  }
}
