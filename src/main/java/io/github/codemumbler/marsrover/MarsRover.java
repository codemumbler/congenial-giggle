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
    MarsRoverStrategy command = null;
    if (commands == 'f') {
      command = new MoveForward();
    }
    if (commands == 'b') {
      command = new MoveBackward();
    }
    if (commands == 'l') {
      command = new TurnLeft();
    }
    if (commands == 'r') {
      command = new TurnRight();
    }
    coordinates = command.execute(getPosition());
  }

  public Vector getPosition() {
    return this.coordinates;
  }
}
