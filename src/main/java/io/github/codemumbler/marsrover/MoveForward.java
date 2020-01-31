package io.github.codemumbler.marsrover;

public class MoveForward implements MarsRoverStrategy {

  @Override
  public Vector execute(Vector coordinates) {
    return new Vector(coordinates.getX(), coordinates.getY() + 1, coordinates.getDirection());
  }
}
