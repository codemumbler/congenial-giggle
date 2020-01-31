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
    if (commands == 'l') {
      command = new TurnLeft();
    }
    coordinates = command.execute(getPosition());
  }

  public Vector getPosition() {
    return this.coordinates;
  }
}
