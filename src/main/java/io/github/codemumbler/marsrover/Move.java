package io.github.codemumbler.marsrover;

abstract class Move implements Command {

  private static final int MAP_SIZE = 100;

  @Override
  public Vector execute(Vector coordinates) {
    switch (coordinates.getDirection()) {
      case N:
        return new Vector(coordinates.getX(), newCoordinateValue(coordinates.getY() + getNorthIncrement()), coordinates.getDirection());
      case S:
        return new Vector(coordinates.getX(), newCoordinateValue(coordinates.getY() + getSouthIncrement()), coordinates.getDirection());
      case W:
        return new Vector(newCoordinateValue(coordinates.getX() + getWestIncrement()), coordinates.getY(), coordinates.getDirection());
      default:
        return new Vector(newCoordinateValue(coordinates.getX() + getEastIncrement()), coordinates.getY(), coordinates.getDirection());
    }
  }

  private int newCoordinateValue(int nextCoordinate) {
    return nextCoordinate < 0 ? MAP_SIZE : (nextCoordinate) % (MAP_SIZE + 1);
  }

  protected abstract int getNorthIncrement();

  protected abstract int getSouthIncrement();

  protected abstract int getWestIncrement();

  protected abstract int getEastIncrement();
}
