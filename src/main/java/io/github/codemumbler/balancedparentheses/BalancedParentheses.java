package io.github.codemumbler.balancedparentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParentheses {

  private final Deque<Character> stack = new ArrayDeque<>();

  public boolean isBalanced(String parentheses) {
    for (int i = 0; i < parentheses.length(); i++) {
      Character currentBracket = parentheses.charAt(i);
      if (isMatchingNext(currentBracket)) {
        stack.pop();
      } else {
        stack.push(parentheses.charAt(i));
      }
    }
    return stack.isEmpty();
  }

  private boolean isMatchingNext(Character currentBracket) {
    return isClosingParentheses(currentBracket) && !stack.isEmpty() && stack.peek().equals(matchingBracket(currentBracket));
  }

  private Character matchingBracket(Character currentBracket) {
    if (currentBracket.equals(')')) {
      return '(';
    } else if (currentBracket.equals(']')) {
      return '[';
    }
    return '{';
  }

  private boolean isClosingParentheses(Character parentheses) {
    return parentheses.equals(')') || parentheses.equals('}') || parentheses.equals(']');
  }
}
