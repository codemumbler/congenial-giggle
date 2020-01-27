package io.github.codemumbler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

  @Test
  public void addTwoNumbers() {
    StringCalculator stringCalculator = new StringCalculator();
    assertEquals(3, stringCalculator.add("1,2"));
  }
}
