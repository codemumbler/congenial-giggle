package io.github.codemumbler.banking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

  @Test
  public void deposit() {
    Account account = new Account();
    account.deposit(new Amount(100.0));
    assertEquals(100.0, account.balance());
  }
}
