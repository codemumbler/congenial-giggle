package io.github.codemumbler.marsrover;

abstract class Move implements Command {

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
    return nextCoordinate < 0 ? 100 : (nextCoordinate) % 101;
  }

  protected abstract int getNorthIncrement();

  protected abstract int getSouthIncrement();

  protected abstract int getWestIncrement();

  protected abstract int getEastIncrement();
}
