package io.github.codemumbler.banking;

public class Account {

  private Transactions transactions = new Transactions();

  public void deposit(double amount) {
    transactions.addDeposit(new Amount(amount));
  }

  public double balance() {
    return transactions.balance();
  }

  public void withdrawl(double amount) {
    transactions.addWithdrawl(new Amount(-1d * amount));
  }

  public String printStatement() {
    return new Statement(transactions.history()).toString();
  }
}
