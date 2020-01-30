package io.github.codemumbler;

public class RockPaperScissors {

  public int play(String playerOne, String playerTwo) {
    if (playerOne.equals("rock") && playerTwo.equals("scissors"))
      return 1;
    return 2;
  }
}
