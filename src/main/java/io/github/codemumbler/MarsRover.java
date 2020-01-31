package io.github.codemumbler;

public class MarsRover {

  public enum DIRECTION {N, E}


  static class Point {
    private final DIRECTION direction;
    private int x;
    private int y;

    public Point(int x, int y, DIRECTION d) {
      this.x = x;
      this.y = y;
      this.direction = d;
    }

    @Override
    public String toString() {
      return "Point{" + "direction=" + direction + ", x=" + x + ", y=" + y + '}';
    }
  }


  private Point coordinates;

  public MarsRover() {
    this(0, 0, DIRECTION.N);
  }

  public MarsRover(int x, int y, DIRECTION direction) {
    this.coordinates = new Point(x, y, direction);
  }

  public Point getPosition() {
    return this.coordinates;
  }
}
