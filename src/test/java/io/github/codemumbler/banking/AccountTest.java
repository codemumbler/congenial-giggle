package io.github.codemumbler.banking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

  public static final double ONE_HUNDRED = 100.0;
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
  }

  @AfterEach
  public void tearDown() {
    BankClock.setInstance(null);
  }

  @Test
  public void deposit() {
    account.deposit(ONE_HUNDRED);
    assertEquals(100.0, account.balance());
  }

  @Test
  public void noTransactions() {
    assertEquals(0.0, account.balance());
  }

  @Test
  public void twoDeposits() {
    account.deposit(ONE_HUNDRED);
    account.deposit(ONE_HUNDRED);
    assertEquals(200.0, account.balance());
  }

  @Test
  public void withdrawl() {
    account.deposit(ONE_HUNDRED);
    account.withdrawl(ONE_HUNDRED);
    assertEquals(0.0, account.balance());
  }

  @Test
  public void printStatement() {
    account.deposit(ONE_HUNDRED);
    assertEquals("02/08/2020 $100.00 $100.00" + System.lineSeparator(), account.printStatement());
  }

  @Test
  public void printStatementForDualTransaction() {
    account.deposit(ONE_HUNDRED);
    account.withdrawl(25d);
    assertEquals("02/08/2020 $100.00 $100.00" + System.lineSeparator() + "02/08/2020 ($25.00) $75.00" + System.lineSeparator(),
        account.printStatement());
  }
}
