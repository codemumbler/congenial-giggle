package io.github.codemumbler.banking;

import java.time.Instant;

public class Amount {

  private final double value;
  private final Instant date;

  public Amount(double amount) {
    this.value = amount;
    this.date = BankClock.getInstance().currentTime();
  }

  private Amount(double amount, Instant date) {
    this.value = amount;
    this.date = date;
  }

  double value() {
    return value;
  }

  Instant date() {
    return date;
  }

  Amount negative() {
    return new Amount(value * -1d, this.date());
  }

  
}
