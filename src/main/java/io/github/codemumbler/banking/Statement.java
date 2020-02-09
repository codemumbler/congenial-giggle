package io.github.codemumbler.banking;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

class Statement {

  private List<Amount> transactionHistory;

  Statement(List<Amount> transactionHistory) {
    this.transactionHistory = transactionHistory;
  }

  @Override
  public String toString() {
    String lineFormat = "%s %s $%.2f%n";
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyy").withZone(ZoneId.systemDefault());
    StringBuilder history = new StringBuilder();
    double balance = 0d;

    for (Amount amount : transactionHistory) {
      balance += amount.value();
      history.append(String.format(lineFormat, dateFormat.format(amount.date()), formatValue(amount.value()), balance));
    }
    return history.toString();
  }

  private String formatValue(double value) {
    StringBuilder formattedValue = new StringBuilder(String.format("$%.2f", Math.abs(value)));
    if (value < 0) {
      formattedValue.insert(0, "(").append(")");
    }
    return formattedValue.toString();
  }
}
