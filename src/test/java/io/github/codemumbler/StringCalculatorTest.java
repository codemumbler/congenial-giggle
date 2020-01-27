package io.github.codemumbler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

  @Test
  public void addNumbers_9() {
    assertEquals(9, stringCalculator.add("1,1,1,1,1,1,1,1,1"));
  }

  @Test
  public void addNumbersSplitByNewLine() {
    assertEquals(6, stringCalculator.add("1\n2,3"));
  }

  @Test
  public void newDelimiter() {
    assertEquals(3, stringCalculator.add("//;\n1;2"));
  }

  @Test
  public void badNewDelimiter() {
    assertThrows(NumberFormatException.class, () -> stringCalculator.add("//;1,2"));
  }

  @Test
  public void noNegativeAllowed() {
    String message = "";
    try {
      stringCalculator.add("-1,2");
    } catch (Exception e) {
      message = e.getMessage();
    }
    assertEquals("negatives not allowed -1", message);
  }

  @Test
  public void noNegativesAllowed() {
    String message = "";
    try {
      stringCalculator.add("-1,-2");
    } catch (Exception e) {
      message = e.getMessage();
    }
    assertEquals("negatives not allowed -1, -2", message);
  }
}
