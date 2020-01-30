package io.github.codemumbler;

public class RockPaperScissors {

  public enum PLAYS {
    ROCK, SCISSORS, PAPER
  }

  public int play(PLAYS playerOne, PLAYS playerTwo) {
    if (playerOne.equals(PLAYS.ROCK) && playerTwo.equals(PLAYS.SCISSORS) || playerOne.equals(PLAYS.SCISSORS) && playerTwo.equals(PLAYS.PAPER))
      return 1;
    return 2;
  }
}
