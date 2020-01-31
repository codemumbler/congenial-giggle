package io.github.codemumbler.marsrover;

class MoveBackward implements MarsRoverStrategy {

  @Override
  public Vector execute(Vector coordinates) {
    switch (coordinates.getDirection()) {
      case S:
        return new Vector(coordinates.getX(), coordinates.getY() + 1, coordinates.getDirection());
      case E:
        return new Vector(coordinates.getX() - 1, coordinates.getY(), coordinates.getDirection());
      default:
        return new Vector(coordinates.getX(), coordinates.getY() - 1, coordinates.getDirection());
    }
  }
}
