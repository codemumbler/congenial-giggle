package io.github.codemumbler.marsrover;

class TurnLeft implements Command {

  @Override
  public Vector execute(Vector coordinates) {
    int newOrdinal = ((coordinates.getDirection().ordinal() + 3) % 4);
    Vector.DIRECTION newDirection = Vector.DIRECTION.values()[newOrdinal];
    return new Vector(coordinates.getX(), coordinates.getY(), newDirection);
  }
}
