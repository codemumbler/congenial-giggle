package io.github.codemumbler;

import java.util.Stack;

public class BalancedParentheses {

  private Stack<Character> stack = new Stack<>();

  public boolean isBalanced(String parentheses) {
    for (int i = 0; i < parentheses.length() / 2; i++) {
      stack.push(parentheses.charAt(i));
    }
    for (int i = parentheses.length() / 2; i < parentheses.length(); i++) {
      if (!(stack.pop().equals('(') && parentheses.charAt(i) == ')')) {
        return false;
      }
    }
    return true;
  }
}
