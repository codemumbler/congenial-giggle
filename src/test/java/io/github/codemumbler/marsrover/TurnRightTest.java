package io.github.codemumbler.marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TurnRightTest {

  private TurnRight turnRight;

  @BeforeEach
  public void setUp() {
    turnRight = new TurnRight();
  }

  @Test
  public void turnLeftFromNorth() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.N);
    assertEquals("Vector{direction=E, x=0, y=0}", turnRight.execute(vector).toString());
  }

  @Test
  public void turnLeftFromEast() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.E);
    assertEquals("Vector{direction=S, x=0, y=0}", turnRight.execute(vector).toString());
  }

  @Test
  public void turnLeftFromWest() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.W);
    assertEquals("Vector{direction=N, x=0, y=0}", turnRight.execute(vector).toString());
  }

  @Test
  public void turnLeftFromSouth() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.S);
    assertEquals("Vector{direction=W, x=0, y=0}", turnRight.execute(vector).toString());
  }

}
