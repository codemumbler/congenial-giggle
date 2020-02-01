package io.github.codemumbler.marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TurnTest {

  private Turn turn;

  @BeforeEach
  public void setUp() {
    turn = new Turn() {

      @Override
      protected int getRotationalValue() {
        return 1;
      }
    };
  }

  @Test
  public void turnOneFromNorth() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.N);
    assertEquals("Vector{direction=E, x=0, y=0}", turn.execute(vector).toString());
  }

  @Test
  public void turnOneFromEast() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.E);
    assertEquals("Vector{direction=S, x=0, y=0}", turn.execute(vector).toString());
  }

  @Test
  public void turnOneFromWest() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.W);
    assertEquals("Vector{direction=N, x=0, y=0}", turn.execute(vector).toString());
  }

  @Test
  public void turnOneFromSouth() {
    Vector vector = new Vector(0, 0, Vector.DIRECTION.S);
    assertEquals("Vector{direction=W, x=0, y=0}", turn.execute(vector).toString());
  }
}
