package io.github.codemumbler.romannumerals;

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

  @Test
  public void convertSix() {
    assertEquals("VI", romanNumerals.convert(6));
  }

  @Test
  public void convertEight() {
    assertEquals("VIII", romanNumerals.convert(8));
  }

  @Test
  public void convertNine() {
    assertEquals("IX", romanNumerals.convert(9));
  }

  @Test
  public void convertTen() {
    assertEquals("X", romanNumerals.convert(10));
  }

  @Test
  public void convertEleven() {
    assertEquals("XI", romanNumerals.convert(11));
  }

  @Test
  public void convertForty() {
    assertEquals("XL", romanNumerals.convert(40));
  }

  @Test
  public void convertFifty() {
    assertEquals("L", romanNumerals.convert(50));
  }

  @Test
  public void convert99() {
    assertEquals("XC", romanNumerals.convert(90));
  }

  @Test
  public void convert100() {
    assertEquals("C", romanNumerals.convert(100));
  }

  @Test
  public void convert400() {
    assertEquals("CD", romanNumerals.convert(400));
  }

  @Test
  public void convert500() {
    assertEquals("D", romanNumerals.convert(500));
  }

  @Test
  public void convert900() {
    assertEquals("CM", romanNumerals.convert(900));
  }

  @Test
  public void convert1000() {
    assertEquals("M", romanNumerals.convert(1000));
  }
}
