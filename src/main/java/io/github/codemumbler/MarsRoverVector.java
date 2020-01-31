package io.github.codemumbler;

public class MarsRoverVector {

  public enum DIRECTION {N, E, W}


  private DIRECTION direction;
  private int x;
  private int y;

  public MarsRoverVector(int x, int y, DIRECTION d) {
    this.x = x;
    this.y = y;
    this.direction = d;
  }

  public DIRECTION getDirection() {
    return direction;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public String toString() {
    return "Vector{" + "direction=" + direction + ", x=" + x + ", y=" + y + '}';
  }
}
