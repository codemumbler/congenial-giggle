package io.github.codemumbler.marsrover;

public class TurnLeft implements MarsRoverStrategy {

  @Override
  public Vector execute(Vector coordinates) {
    return new Vector(coordinates.getX(), coordinates.getY(), Vector.DIRECTION.W);
  }
}
