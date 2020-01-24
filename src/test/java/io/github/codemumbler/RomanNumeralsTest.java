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
}
