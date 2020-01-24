package io.github.codemumbler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsTest {

  @Test
  public void convertOneToI() {
    RomanNumerals romanNumerals = new RomanNumerals();
    assertEquals("I", romanNumerals.convert(1));
  }
}
