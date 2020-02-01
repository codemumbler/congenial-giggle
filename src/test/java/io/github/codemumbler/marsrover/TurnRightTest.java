package io.github.codemumbler.marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TurnRightTest {

  @Test
  public void turnLeftFromNorth() {
    TurnRight turnRight = new TurnRight();
    Vector vector = new Vector(0, 0, Vector.DIRECTION.N);
    assertEquals("Vector{direction=E, x=0, y=0}", turnRight.execute(vector).toString());
  }
}
