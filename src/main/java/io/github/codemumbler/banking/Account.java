package io.github.codemumbler.banking;

public class Account {

  private final Transactions transactions = new Transactions();
  private final StatementList statementList = new StatementList();

  public void deposit(Amount amount) {
    addtransaction(amount);
  }

  private void addtransaction(Amount amount) {
    transactions.addAmount(amount);
    statementList.addTransaction(new Statement(amount, transactions.balance()));
  }

  public double balance() {
    return transactions.balance();
  }

  public void withdrawl(Amount amount) {
    addtransaction(amount.negative());
  }

  public String printStatement() {
    return printStatement(PrintFilter.DEFAULT_FILTER);
  }

  public String printStatement(PrintFilter filter) {
    return statementList.printWith(filter);
  }
}
