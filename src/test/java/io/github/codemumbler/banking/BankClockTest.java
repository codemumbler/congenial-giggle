package io.github.codemumbler.banking;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankClockTest {

  @Test
  public void currentTime() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd hh24mmss").withZone(ZoneId.systemDefault());
    Instant expectedCurrentTime = Instant.now();
    assertEquals(formatter.format(expectedCurrentTime), formatter.format(BankClock.getInstance().currentTime()));
  }
}
