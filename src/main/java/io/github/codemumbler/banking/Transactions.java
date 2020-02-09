package io.github.codemumbler.banking;

import java.util.ArrayList;
import java.util.List;

class Transactions {

  private List<Amount> amounts = new ArrayList<>();

  void addDeposit(Amount amount) {
    amounts.add(amount);
  }

  void addWithdrawl(Amount amount) {
    amounts.add(amount);
  }

  double balance() {
    double balance = 0d;
    for (Amount amount : amounts) {
      balance += amount.value();
    }
    return balance;
  }

  public List<Amount> history() {
    return amounts;
  }
}
