package io.github.codemumbler.rockpaperscissors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RockPaperScissorsTest {

  private RockPaperScissors rockPaperScissors;

  @BeforeEach
  public void setUp() {
    rockPaperScissors = new RockPaperScissors();
  }

  @Test
  public void rockBeatsScissorsForPlayerOne() {
    assertEquals(1, rockPaperScissors.play(RockPaperScissors.PLAYS.ROCK, RockPaperScissors.PLAYS.SCISSORS));
  }

  @Test
  public void rockBeatsScissorsForPlayerTwo() {
    assertEquals(2, rockPaperScissors.play(RockPaperScissors.PLAYS.SCISSORS, RockPaperScissors.PLAYS.ROCK));
  }

  @Test
  public void scissorsBeatsPaperForPlayerOne() {
    assertEquals(1, rockPaperScissors.play(RockPaperScissors.PLAYS.SCISSORS, RockPaperScissors.PLAYS.PAPER));
  }

  @Test
  public void scissorsBeatsPaperForPlayerTwo() {
    assertEquals(2, rockPaperScissors.play(RockPaperScissors.PLAYS.PAPER, RockPaperScissors.PLAYS.SCISSORS));
  }

  @Test
  public void paperBeatsRockForPlayerOne() {
    assertEquals(1, rockPaperScissors.play(RockPaperScissors.PLAYS.PAPER, RockPaperScissors.PLAYS.ROCK));
  }

  @Test
  public void paperBeatsRockForPlayerTwo() {
    assertEquals(2, rockPaperScissors.play(RockPaperScissors.PLAYS.ROCK, RockPaperScissors.PLAYS.PAPER));
  }

  @Test
  public void drawIfPlaysAreTheSame() {
    assertEquals(0, rockPaperScissors.play(RockPaperScissors.PLAYS.PAPER, RockPaperScissors.PLAYS.PAPER));
  }
}
