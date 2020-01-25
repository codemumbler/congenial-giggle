package io.github.codemumbler;

public class FizzBuzz {

  public String convert(int i) {
    if (i % 3 == 0) {
      return "fizz";
    }
    return String.valueOf(i);
  }
}
