package io.github.codemumbler.banking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

  private Account account;
  private Amount OneHundred = new Amount(100.0);

  @BeforeEach
  public void setUp() {
    account = new Account();
  }

  @Test
  public void deposit() {
    account.deposit(OneHundred);
    assertEquals(100.0, account.balance());
  }

  @Test
  public void noTransactions() {
    assertEquals(0.0, account.balance());
  }

  @Test
  public void twoDeposits() {
    account.deposit(OneHundred);
    account.deposit(OneHundred);
    assertEquals(200.0, account.balance());
  }
}
