package io.github.codemumbler.fizzbuzz;

public class FizzBuzz {

  public String convert(int i) {
    StringBuilder fizzBuzzReturn = new StringBuilder();
    if (i % 3 == 0) {
      fizzBuzzReturn.append("Fizz");
    }
    if (i % 5 == 0) {
      fizzBuzzReturn.append("Buzz");
    }
    if (fizzBuzzReturn.length() == 0) {
      fizzBuzzReturn.append(i);
    }
    return fizzBuzzReturn.toString();
  }
}
