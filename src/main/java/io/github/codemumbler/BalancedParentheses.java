package io.github.codemumbler;

import java.util.Stack;

public class BalancedParentheses {

  private Stack<Character> stack = new Stack<>();

  public boolean isBalanced(String parentheses) {
    for (int i = 0; i < parentheses.length(); i++) {
      Character currentBracket = parentheses.charAt(i);
      if (isClosingParentheses(currentBracket) && !stack.isEmpty() && stack.peek().equals(matchingBracket(currentBracket)))
        stack.pop();
      else
        stack.push(parentheses.charAt(i));
    }
    return stack.isEmpty();
  }

  private Character matchingBracket(Character currentBracket) {
    if (currentBracket.equals(')')) {
      return '(';
    }
    return '{';
  }

  private boolean isClosingParentheses(Character parentheses) {
    return parentheses.equals(')') || parentheses.equals('}');
  }
}
