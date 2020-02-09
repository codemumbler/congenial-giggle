package io.github.codemumbler.banking;

import java.util.ArrayList;
import java.util.List;

public class Account {

  private List<Amount> transactions = new ArrayList<>();

  public void deposit(Amount amount) {
    transactions.add(amount);
  }

  public double balance() {
    double balance = 0d;
    for (Amount amount : transactions) {
      balance += amount.value();
    }
    return balance;
  }
}
