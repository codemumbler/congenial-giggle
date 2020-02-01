package io.github.codemumbler.marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoveTest {

  private Move move;

  @BeforeEach
  public void setUp() {
    move = new Move() {

      @Override
      protected int getCoordinateIncrement() {
        return 1;
      }
    };
  }

  @Test
  public void moveForwardNorth() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.N);
    assertEquals("Vector{direction=N, x=0, y=1}", move.execute(vector).toString());
  }

  @Test
  public void moveForwardEast() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.E);
    assertEquals("Vector{direction=E, x=1, y=0}", move.execute(vector).toString());
  }

  @Test
  public void moveForwardWest() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.W);
    assertEquals("Vector{direction=W, x=100, y=0}", move.execute(vector).toString());
  }

  @Test
  public void moveForwardSouth() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.S);
    assertEquals("Vector{direction=S, x=0, y=100}", move.execute(vector).toString());
  }

  @Test
  public void wrapFromSouth() {
    Vector vector = new Vector(0, 100, Vector.DIRECTION.N);
    assertEquals("Vector{direction=N, x=0, y=0}", move.execute(vector).toString());
  }

  @Test
  public void wrapFromWest() {
    Vector vector = new Vector(100, 0, Vector.DIRECTION.E);
    assertEquals("Vector{direction=E, x=0, y=0}", move.execute(vector).toString());
  }
}
