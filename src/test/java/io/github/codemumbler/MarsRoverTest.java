package io.github.codemumbler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

  private MarsRover marsRover;

  @BeforeEach
  public void setUp() {
    marsRover = new MarsRover();
  }

  @Test
  public void startPosition() {
    assertEquals(new int[] {0, 0}, marsRover.getPosition());
  }
}
