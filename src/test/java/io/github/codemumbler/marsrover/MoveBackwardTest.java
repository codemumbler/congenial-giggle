package io.github.codemumbler.marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoveBackwardTest {

  private MoveBackward moveBackward;

  @BeforeEach
  public void setUp() {
    moveBackward = new MoveBackward();
  }

  @Test
  public void moveForwardNorth() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.N);
    assertEquals("Vector{direction=N, x=0, y=-1}", moveBackward.execute(vector).toString());
  }
}
