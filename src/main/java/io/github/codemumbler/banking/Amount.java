package io.github.codemumbler.banking;

import java.time.Instant;

class Amount {

  private final double value;
  private final Instant date;

  Amount(double amount) {
    this.value = amount;
    this.date = BankClock.getInstance().currentTime();
  }

  double value() {
    return value;
  }

  Instant date() {
    return date;
  }
}
