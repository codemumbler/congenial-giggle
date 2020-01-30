package io.github.codemumbler;

public class RockPaperScissors {

  private static final String ROCK = "rock";
  private static final String SCISSORS = "scissors";
  private static final String PAPER = "paper";

  public int play(String playerOne, String playerTwo) {
    if (playerOne.equals(ROCK) && playerTwo.equals(SCISSORS) || playerOne.equals(SCISSORS) && playerTwo.equals(PAPER))
      return 1;
    return 2;
  }
}
