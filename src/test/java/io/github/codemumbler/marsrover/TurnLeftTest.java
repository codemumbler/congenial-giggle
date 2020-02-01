package io.github.codemumbler.marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TurnLeftTest {

  @Test
  public void turnLeftFromNorth() {
    TurnLeft turnLeft = new TurnLeft();
    Vector vector = new Vector(0, 0, Vector.DIRECTION.N);
    assertEquals("Vector{direction=W, x=0, y=0}", turnLeft.execute(vector).toString());
  }
}
