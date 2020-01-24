package io.github.codemumbler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

  private RomanNumerals romanNumerals;

  @BeforeEach
  public void setUp() {
    romanNumerals = new RomanNumerals();
  }

  @Test
  public void convertOne() {
    assertEquals("I", romanNumerals.convert(1));
  }

  @Test
  public void convertTwo() {
    assertEquals("II", romanNumerals.convert(2));
  }

  @Test
  public void convertThree() {
    assertEquals("III", romanNumerals.convert(3));
  }

  @Test
  public void convertFour() {
    assertEquals("IV", romanNumerals.convert(4));
  }

  @Test
  public void convertFive() {
    assertEquals("V", romanNumerals.convert(5));
  }
}
