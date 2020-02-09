package io.github.codemumbler.banking;

import java.time.Instant;

class BankClock {

  private static BankClock bankClockSingleton;

  static BankClock getInstance() {
    if (bankClockSingleton == null) {
      bankClockSingleton = new BankClock();
    }
    return bankClockSingleton;
  }

  static void setInstance(BankClock instance) {
    bankClockSingleton = instance;
  }

  public Instant currentTime() {
    return Instant.now();
  }
}
