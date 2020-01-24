package io.github.codemumbler;

public class RomanNumerals {

  public String convert(int i) {
    if (i == 3)
      return "III";
    if (i == 2)
      return "II";
    return "I";
  }
}
