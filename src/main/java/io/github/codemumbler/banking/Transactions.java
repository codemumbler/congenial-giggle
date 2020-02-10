package io.github.codemumbler.banking;

import java.util.ArrayList;
import java.util.List;

class Transactions {

  private final List<Amount> amounts = new ArrayList<>();

  double balance() {
    double balance = 0d;
    for (Amount amount : amounts) {
      balance += amount.value();
    }
    return balance;
  }

  List<Amount> history() {
    return amounts;
  }

  void addAmount(Amount amount) {
    amounts.add(amount);
  }
}
