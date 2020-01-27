package io.github.codemumbler;

public class StringCalculator {

  public int add(String numbers) {
    int total = 0;
    String delimiter = getDelimiter(numbers);
    if (hasADelimiter(numbers)) {
      numbers = numbers.substring(numbers.indexOf("\n") + 1);
    }
    for (String number : numbers.split(delimiter)) {
      total += (number.isEmpty() ? 0 : Integer.parseInt(number));
    }
    return total;
  }

  private String getDelimiter(String numbers) {
    if (hasADelimiter(numbers)) {
      return numbers.substring(2, numbers.indexOf("\n"));
    }
    return "[\n,]";
  }

  private boolean hasADelimiter(String numbers) {
    return numbers.contains("//") && numbers.contains("\n");
  }
}
