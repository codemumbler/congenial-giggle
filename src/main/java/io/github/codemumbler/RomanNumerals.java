package io.github.codemumbler;

public class RomanNumerals {

  public String convert(int i) {
    if (i == 9) {
      return "IX";
    }
    if (i > 5) {
      return "V" + convert(i-5);
    }
    switch (i) {
      case 5: return "V";
      case 4: return "IV";
      case 3: return "III";
      case 2: return "II";
      default: return "I";
    }
  }
}
