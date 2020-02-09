package io.github.codemumbler.banking;

public class Account {

  private Amount amount;

  public void deposit(Amount amount) {
    this.amount = amount;
  }

  public double balance() {
    return this.amount.value();
  }
}
