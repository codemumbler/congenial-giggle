package io.github.codemumbler.banking;

public class Account {

  private Transactions transactions = new Transactions();

  public void deposit(Amount amount) {
    transactions.addDeposit(amount);
  }

  public double balance() {
    return transactions.balance();
  }

  public void withdrawl(Amount amounts) {
    transactions.addWithdrawl(amounts);
  }
}
