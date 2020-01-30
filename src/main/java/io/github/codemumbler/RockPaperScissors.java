package io.github.codemumbler;

public class RockPaperScissors {

  public enum PLAYS {
    ROCK, SCISSORS, PAPER
  }

  public int play(PLAYS playerOne, PLAYS playerTwo) {
    if ((playerOne.equals(PLAYS.ROCK) && playerTwo.equals(PLAYS.SCISSORS)) || (playerOne.equals(PLAYS.SCISSORS) && playerTwo.equals(PLAYS.PAPER)) || (
        playerOne.equals(PLAYS.PAPER) && playerTwo.equals(PLAYS.ROCK))) {
      return 1;
    }
    return 2;
  }
}
