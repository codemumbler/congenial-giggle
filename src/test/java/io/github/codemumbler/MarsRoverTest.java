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
  public void getPosition() {
    assertEquals("Vector{direction=N, x=0, y=0}", marsRover.getPosition().toString());
  }

  @Test
  public void setStartPosition() {
    marsRover = new MarsRover(1, 1, MarsRover.DIRECTION.E);
    assertEquals("Vector{direction=E, x=1, y=1}", marsRover.getPosition().toString());
  }

  @Test
  public void moveForward() {
    marsRover.command('f');
    assertEquals("Vector{direction=N, x=0, y=1}", marsRover.getPosition().toString());
  }
}
