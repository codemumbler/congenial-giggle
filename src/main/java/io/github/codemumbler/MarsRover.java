package io.github.codemumbler;

public class MarsRover {

  private Point coordinates;

  public MarsRover(int x, int y) {
    this.coordinates = new Point(x, y);
  }

  public MarsRover() {
    this(0, 0);
  }

  public Point getPosition() {
    return this.coordinates;
  }

  static class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public String toString() {
      return "Point{" + "x=" + x + ", y=" + y + '}';
    }
  }
}
