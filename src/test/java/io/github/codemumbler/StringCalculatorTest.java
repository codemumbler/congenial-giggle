package io.github.codemumbler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

  private StringCalculator stringCalculator;

  @BeforeEach
  public void setUp() {
    stringCalculator = new StringCalculator();
  }

  @Test
  public void addTwoNumbers_3() {
    assertEquals(3, stringCalculator.add("1,2"));
  }

  @Test
  public void addTwoNumbers_2() {
    assertEquals(2, stringCalculator.add("1,1"));
  }

  @Test
  public void addEmptyString() {
    assertEquals(0, stringCalculator.add(""));
  }
}
