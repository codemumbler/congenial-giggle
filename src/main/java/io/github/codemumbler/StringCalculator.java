package io.github.codemumbler;

public class StringCalculator {

  public int add(String numbers) {
    int total = 0;
    for (String number : numbers.split("[,\\n]")) {
      total += (number.isEmpty() ? 0 : Integer.parseInt(number));
    }
    return total;
  }
}
