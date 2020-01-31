package io.github.codemumbler.marsrover;

public class MarsRover {

  private Vector coordinates;

  public MarsRover() {
    this(0, 0, Vector.DIRECTION.N);
  }

  public MarsRover(int x, int y, Vector.DIRECTION direction) {
    this.coordinates = new Vector(x, y, direction);
  }

  public void execute(char commands) {
    if (commands == 'f') {
      MarsRoverStrategy command = new MoveForward();
      coordinates = command.execute(getPosition());
    }
    if (commands == 'l') {
      if (coordinates.getDirection().equals(Vector.DIRECTION.N)) {
        coordinates = new Vector(coordinates.getX(), coordinates.getY(), Vector.DIRECTION.W);
      }
    }
  }

  public Vector getPosition() {
    return this.coordinates;
  }
}
