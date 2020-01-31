package io.github.codemumbler.marsrover;

class Vector {

  enum DIRECTION {N, E, W}


  private final DIRECTION direction;
  private final int x;
  private final int y;

  Vector(int x, int y, DIRECTION d) {
    this.x = x;
    this.y = y;
    this.direction = d;
  }

  DIRECTION getDirection() {
    return direction;
  }

  int getX() {
    return x;
  }

  int getY() {
    return y;
  }

  @Override
  public String toString() {
    return "Vector{" + "direction=" + direction + ", x=" + x + ", y=" + y + '}';
  }
}
