package io.github.codemumbler.banking;

public class Amount {
  private final double amount;

  public Amount(double amount) {
    this.amount = amount;
  }

  public double value() {
    return amount;
  }
}
