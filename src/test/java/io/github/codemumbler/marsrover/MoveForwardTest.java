package io.github.codemumbler.marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoveForwardTest {

  @Test
  public void moveForward() {
    MoveForward moveForward = new MoveForward();
    assertEquals("Vector{direction=N, x=0, y=1}", moveForward.execute(new Vector(0, 0, Vector.DIRECTION.N)).toString());
  }
}
