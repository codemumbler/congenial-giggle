package io.github.codemumbler.marsrover;

abstract class Turn implements Command {

  @Override
  public Vector execute(Vector coordinates) {
    int newOrdinal = ((coordinates.getDirection().ordinal() + getRotationalValue()) % 4);
    Vector.DIRECTION newDirection = Vector.DIRECTION.values()[newOrdinal];
    return new Vector(coordinates.getX(), coordinates.getY(), newDirection);
  }

  protected abstract int getRotationalValue();
}
