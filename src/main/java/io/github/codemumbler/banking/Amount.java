package io.github.codemumbler.banking;

public class Amount {

  private final double value;

  public Amount(double amount) {
    this.value = amount;
  }

  public double value() {
    return value;
  }
}
