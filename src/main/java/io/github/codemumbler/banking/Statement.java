package io.github.codemumbler.banking;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

class Statement {

  private static final String LINE_FORMAT = "%s\t%s\t$%.2f%n";
  private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyy").withZone(ZoneId.systemDefault());
  private final Amount amount;
  private final double balance;

  Statement(final Amount amount, final double balance) {
    this.amount = amount;
    this.balance = balance;
  }

  @Override
  public String toString() {
    return String.format(LINE_FORMAT, formattedDate(), value(), balance);
  }

  private String formattedDate() {
    return DATE_TIME_FORMATTER.format(amount.date());
  }

  private String value() {
    StringBuilder formattedValue = new StringBuilder(String.format("$%.2f", Math.abs(amount.value())));
    if (isWithdrawl()) {
      formattedValue.insert(0, "(").append(")");
    }
    return formattedValue.toString();
  }

  public boolean isDeposit() {
    return (amount.value() >= 0);
  }

  public boolean isWithdrawl() {
    return (amount.value() < 0);
  }

  public boolean before(Instant beforeDate) {
    return amount.date().isBefore(beforeDate);
  }

  public boolean after(Instant afterDate) {
    return amount.date().isAfter(afterDate);
  }
}
