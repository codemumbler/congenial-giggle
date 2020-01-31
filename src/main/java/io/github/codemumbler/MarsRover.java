package io.github.codemumbler;

public class MarsRover {

  public enum DIRECTION {N, E, W}

  static class Vector {
    private DIRECTION direction;
    private int x;
    private int y;

    public Vector(int x, int y, DIRECTION d) {
      this.x = x;
      this.y = y;
      this.direction = d;
    }

    @Override
    public String toString() {
      return "Vector{" + "direction=" + direction + ", x=" + x + ", y=" + y + '}';
    }
  }

  private Vector coordinates;

  public MarsRover() {
    this(0, 0, DIRECTION.N);
  }

  public MarsRover(int x, int y, DIRECTION direction) {
    this.coordinates = new Vector(x, y, direction);
  }

  public void command(char commands) {
    if (commands == 'f') {
      if (getPosition().direction.equals(DIRECTION.N)) {
        getPosition().y++;
      }
    }
    if (commands == 'l') {
      if (getPosition().direction.equals(DIRECTION.N)) {
        getPosition().direction = DIRECTION.W;
      }
    }
  }

  public Vector getPosition() {
    return this.coordinates;
  }
}
