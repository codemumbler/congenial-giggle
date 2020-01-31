package io.github.codemumbler.marsrover;

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
    marsRover = new MarsRover(1, 1, Vector.DIRECTION.E);
    assertEquals("Vector{direction=E, x=1, y=1}", marsRover.getPosition().toString());
  }

  @Test
  public void moveForward() {
    marsRover.execute('f');
    assertEquals("Vector{direction=N, x=0, y=1}", marsRover.getPosition().toString());
  }

  @Test
  public void turnLeft() {
    marsRover.execute('l');
    assertEquals("Vector{direction=W, x=0, y=0}", marsRover.getPosition().toString());
  }

  @Test
  public void turnRight() {
    marsRover.execute('r');
    assertEquals("Vector{direction=E, x=0, y=0}", marsRover.getPosition().toString());
  }
}
