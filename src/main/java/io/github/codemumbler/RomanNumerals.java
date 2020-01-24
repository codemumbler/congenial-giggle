package io.github.codemumbler;

public class RomanNumerals {

  public String convert(int i) {
    if (i >= 40) {
      return "XL" + convert(i - 40);
    }
    if (i >= 10) {
      return "X" + convert(i - 10);
    }
    if (i == 9) {
      return "IX";
    }
    if (i >= 5) {
      return "V" + convert(i - 5);
    }
    if (i == 4) {
      return "IV";
    }
    if (i == 0) {
      return "";
    }
    return "I" + convert(i - 1);
  }
}
