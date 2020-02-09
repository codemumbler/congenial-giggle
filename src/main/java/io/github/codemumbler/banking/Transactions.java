package io.github.codemumbler.banking;

import java.util.ArrayList;
import java.util.List;

public class Transactions {

  private List<Amount> deposits = new ArrayList<>();
  private List<Amount> withdrawls = new ArrayList<>();

  public void addDeposit(Amount amount) {
    deposits.add(amount);
  }

  public void addWithdrawl(Amount amount) {
    withdrawls.add(amount);
  }

  public double balance() {
    double balance = 0d;
    for (Amount amount : deposits) {
      balance += amount.value();
    }
    for (Amount amount : withdrawls) {
      balance -= amount.value();
    }
    return balance;
  }
}
