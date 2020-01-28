package io.github.codemumbler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedParenthesesTest {

  @Test
  public void oneSetIsBalanced() {
    BalancedParentheses balancedParentheses = new BalancedParentheses();
    assertTrue(balancedParentheses.isBalanced("()"));
  }
}
