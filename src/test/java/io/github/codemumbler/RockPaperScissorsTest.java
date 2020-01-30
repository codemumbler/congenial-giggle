package io.github.codemumbler;

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
    assertEquals(1, rockPaperScissors.play("rock", "scissors"));
  }

  @Test
  public void rockBeatsScissorsForPlayerTwo() {
    assertEquals(2, rockPaperScissors.play("scissors", "rock"));
  }
}
