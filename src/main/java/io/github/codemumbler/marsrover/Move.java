package io.github.codemumbler.marsrover;

abstract class Move implements Command {

  @Override
  public Vector execute(Vector coordinates) {
    switch (coordinates.getDirection()) {
      case N:
        return new Vector(coordinates.getX(), (coordinates.getY() + getNorthIncrement()) % 101, coordinates.getDirection());
      case S:
        int newY = coordinates.getY() == 0 ? 100 : coordinates.getY() + getSouthIncrement();
        return new Vector(coordinates.getX(), newY, coordinates.getDirection());
      case W:
        int newX = coordinates.getX() == 0 ? 100 : coordinates.getX() + getWestIncrement();
        return new Vector(newX, coordinates.getY(), coordinates.getDirection());
      default:
        return new Vector((coordinates.getX() + getEastIncrement()) % 101, coordinates.getY(), coordinates.getDirection());
    }
  }

  protected abstract int getNorthIncrement();

  protected abstract int getSouthIncrement();

  protected abstract int getWestIncrement();

  protected abstract int getEastIncrement();
}
