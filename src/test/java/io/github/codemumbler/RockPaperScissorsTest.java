package io.github.codemumbler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RockPaperScissorsTest {

  @Test
  public void rockBeatsScissorsForPlayerOne() {
    RockPaperScissors rockPaperScissors = new RockPaperScissors();
    assertEquals(1, rockPaperScissors.play("rock", "scissors"));
  }
}
