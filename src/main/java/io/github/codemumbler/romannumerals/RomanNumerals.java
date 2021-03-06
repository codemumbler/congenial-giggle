package io.github.codemumbler.romannumerals;

public class RomanNumerals {

  private static final String[] ROMAN_NUMERALS = new String[]{ "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
  private static final Integer[] ROMAN_NUMERALS_VALUES = new Integer[]{ 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

  public String convert(int value) {
    for (int index = 0; index < ROMAN_NUMERALS.length; index++) {
      if (ROMAN_NUMERALS_VALUES[index] <= value) {
        return ROMAN_NUMERALS[index] + convert(value - ROMAN_NUMERALS_VALUES[index]);
      }
    }
    return "";
  }
}
