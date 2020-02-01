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
  public void moveBackwardNorth() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.N);
    assertEquals("Vector{direction=N, x=0, y=100}", moveBackward.execute(vector).toString());
  }

  @Test
  public void moveBackwardSouth() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.S);
    assertEquals("Vector{direction=S, x=0, y=1}", moveBackward.execute(vector).toString());
  }

  @Test
  public void moveBackwardEast() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.E);
    assertEquals("Vector{direction=E, x=100, y=0}", moveBackward.execute(vector).toString());
  }

  @Test
  public void moveBackwardWest() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.W);
    assertEquals("Vector{direction=W, x=1, y=0}", moveBackward.execute(vector).toString());
  }
}
