package io.github.codemumbler.marsrover;

abstract class Move implements Command {

  private static final int MAP_SIZE = 100;

  @Override
  public Vector execute(Vector coordinates) {
    switch (coordinates.getDirection()) {
      case N:
        return new Vector(coordinates.getX(), newCoordinateValue(coordinates.getY() + getCoordinateIncrement()), coordinates.getDirection());
      case S:
        return new Vector(coordinates.getX(), newCoordinateValue(coordinates.getY() - getCoordinateIncrement()), coordinates.getDirection());
      case W:
        return new Vector(newCoordinateValue(coordinates.getX() - getCoordinateIncrement()), coordinates.getY(), coordinates.getDirection());
      case E:
      default:
        return new Vector(newCoordinateValue(coordinates.getX() + getCoordinateIncrement()), coordinates.getY(), coordinates.getDirection());
    }
  }

  private int newCoordinateValue(int nextCoordinate) {
    return nextCoordinate < 0 ? MAP_SIZE : (nextCoordinate) % (MAP_SIZE + 1);
  }

  protected abstract int getCoordinateIncrement();
}
