package io.github.codemumbler.marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TurnLeftTest {

  private TurnLeft turnLeft;

  @BeforeEach
  public void setUp() {
    turnLeft = new TurnLeft();
  }

  @Test
  public void turnLeftFromNorth() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.N);
    assertEquals("Vector{direction=W, x=0, y=0}", turnLeft.execute(vector).toString());
  }

  @Test
  public void turnLeftFromEast() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.E);
    assertEquals("Vector{direction=N, x=0, y=0}", turnLeft.execute(vector).toString());
  }

  @Test
  public void turnLeftFromWest() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.W);
    assertEquals("Vector{direction=S, x=0, y=0}", turnLeft.execute(vector).toString());
  }

  @Test
  public void turnLeftFromSouth() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.S);
    assertEquals("Vector{direction=E, x=0, y=0}", turnLeft.execute(vector).toString());
  }
}
