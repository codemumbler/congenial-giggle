package io.github.codemumbler;

public class FizzBuzz {

  public String convert(int i) {
    if (i % 5 == 0 && i % 3 == 0) {
      return "fizzbuzz";
    }
    if (i % 5 == 0) {
      return "buzz";
    }
    if (i % 3 == 0) {
      return "fizz";
    }
    return String.valueOf(i);
  }
}
