package io.github.codemumbler.banking;

public class Account {

  private final Transactions transactions = new Transactions();

  public void deposit(double amount) {
    addtransaction(amount);
  }

  private void addtransaction(double amount) {
    transactions.addAmount(new Amount(amount));
  }

  public double balance() {
    return transactions.balance();
  }

  public void withdrawl(double amount) {
    addtransaction(-1d * amount);
  }

  public String printStatement() {
    return new Statement(transactions.history()).toString();
  }
}
