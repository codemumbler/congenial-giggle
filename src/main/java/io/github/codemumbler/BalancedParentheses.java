package io.github.codemumbler;

import java.util.Stack;

public class BalancedParentheses {

  private Stack<Character> stack = new Stack<>();

  public boolean isBalanced(String parentheses) {
    for (int i = 0; i < parentheses.length(); i++) {
      if (isClosingParentheses(parentheses.charAt(i)) && !stack.isEmpty())
        stack.pop();
      else
        stack.push(parentheses.charAt(i));
    }
    return stack.isEmpty();
  }

  private boolean isClosingParentheses(Character parentheses) {
    return parentheses.equals(')') || parentheses.equals('}');
  }
}
