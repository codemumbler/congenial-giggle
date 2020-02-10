package io.github.codemumbler.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @BeforeEach
  public void setUp() {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  public void one() {
    assertEquals("1", fizzBuzz.convert(1));
  }

  @Test
  public void two() {
    assertEquals("2", fizzBuzz.convert(2));
  }

  @Test
  public void threeFizz() {
    assertEquals("Fizz", fizzBuzz.convert(3));
  }

  @Test
  public void fiveBuzz() {
    assertEquals("Buzz", fizzBuzz.convert(5));
  }

  @Test
  public void fifteenFizzBuzz() {
    assertEquals("FizzBuzz", fizzBuzz.convert(15));
  }

  @Test
  public void first50FizzBuzz() {
    StringBuilder builder = new StringBuilder();
    for (int i = 1; i <= 50; i++) {
      builder.append(fizzBuzz.convert(i)).append(" ");
    }
    assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz"
            + " 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 " + "FizzBuzz 46 47 Fizz 49 Buzz ",
        builder.toString());
  }
}
