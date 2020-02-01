package io.github.codemumbler.marsrover;

class MoveForward extends Move {

  @Override
  protected int getNorthIncrement() {
    return 1;
  }

  @Override
  protected int getSouthIncrement() {
    return -1;
  }

  @Override
  protected int getWestIncrement() {
    return -1;
  }

  @Override
  protected int getEastIncrement() {
    return 1;
  }
}
