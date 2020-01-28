package io.github.codemumbler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedParenthesesTest {

  private BalancedParentheses balancedParentheses;

  @BeforeEach
  public void setUp() {
    balancedParentheses = new BalancedParentheses();
  }

  @Test
  public void oneSetIsBalanced() {
    assertTrue(balancedParentheses.isBalanced("()"));
  }

  @Test
  public void notBalanced() {
    assertFalse(balancedParentheses.isBalanced(")("));
  }

  @Test
  public void twoSetsBalanced() {
    assertTrue(balancedParentheses.isBalanced("(())"));
  }
}
