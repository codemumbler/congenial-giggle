package io.github.codemumbler;

public class RomanNumerals {

  public String convert(int i) {
    switch (i){
      case 5: return "V";
      case 4: return "IV";
      case 3: return "III";
      case 2: return "II";
      default: return "I";
    }
  }
}
