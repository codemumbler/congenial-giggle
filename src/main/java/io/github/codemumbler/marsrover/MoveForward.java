package io.github.codemumbler.marsrover;

class MoveForward implements MarsRoverStrategy {

  @Override
  public Vector execute(Vector coordinates) {
    switch (coordinates.getDirection()) {
      case N:
        return new Vector(coordinates.getX(), coordinates.getY() + 1, coordinates.getDirection());
      case S:
        return new Vector(coordinates.getX(), coordinates.getY() - 1, coordinates.getDirection());
      case W:
        return new Vector(coordinates.getX() - 1, coordinates.getY(), coordinates.getDirection());
      default:
        return new Vector(coordinates.getX() + 1, coordinates.getY(), coordinates.getDirection());
    }
  }
}
