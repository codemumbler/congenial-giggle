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
    assertEquals("Point{x=0, y=0}", marsRover.getPosition().toString());
  }

  @Test
  public void setStartPosition() {
    marsRover = new MarsRover(1, 1);
    assertEquals("Point{x=1, y=1}", marsRover.getPosition().toString());
  }
}
