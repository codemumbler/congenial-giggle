package io.github.codemumbler.marsrover;

class MoveForward extends Move {

  @Override
  protected int getCoordinateIncrement() {
    return 1;
  }
}
