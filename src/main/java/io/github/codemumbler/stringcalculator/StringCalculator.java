package io.github.codemumbler.stringcalculator;

public class StringCalculator {

  public int add(String numbers) {
    int total = 0;
    String delimiter = getDelimiter(numbers);
    if (hasADelimiter(numbers)) {
      numbers = numbers.substring(numbers.indexOf('\n') + 1);
    }
    StringBuilder negatives = new StringBuilder();
    for (String number : numbers.split(delimiter)) {
      int nextNumber = (number.isEmpty() ? 0 : Integer.parseInt(number));
      if (nextNumber < 0) {
        negatives.append(nextNumber).append(", ");
      }
      total += nextNumber;
    }
    if (negatives.length() > 0) {
      negatives = new StringBuilder(negatives.substring(0, negatives.length() - 2));
      throw new ArithmeticException(String.format("negatives not allowed %s", negatives.toString()));
    }
    return total;
  }

  private String getDelimiter(String numbers) {
    if (hasADelimiter(numbers)) {
      return numbers.substring(2, numbers.indexOf('\n'));
    }
    return "[\n,]";
  }

  private boolean hasADelimiter(String numbers) {
    return numbers.contains("//") && numbers.contains("\n");
  }
}
