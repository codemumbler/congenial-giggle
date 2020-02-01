package io.github.codemumbler.marsrover;

class MoveBackward extends Move {

  @Override
  protected int getCoordinateIncrement() {
    return -1;
  }
}
