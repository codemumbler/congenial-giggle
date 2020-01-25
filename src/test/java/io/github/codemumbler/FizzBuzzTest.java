package io.github.codemumbler;

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
    assertEquals("fizz", fizzBuzz.convert(3));
  }

  @Test
  public void fiveBuzz() {
    assertEquals("buzz", fizzBuzz.convert(5));
  }

  @Test
  public void fifteenFizzBuzz() {
    assertEquals("fizzbuzz", fizzBuzz.convert(15));
  }
}
