package io.github.codemumbler.marsrover;

public class MarsRover {

  private Vector coordinates;

  public MarsRover() {
    this(0, 0, Vector.DIRECTION.N);
  }

  public MarsRover(int x, int y, Vector.DIRECTION direction) {
    this.coordinates = new Vector(x, y, direction);
  }

  public void execute(char... commands) {
    for (char command : commands) {
      MarsRoverStrategy commandObject = null;
      if (command == 'f') {
        commandObject = new MoveForward();
      }
      if (command == 'b') {
        commandObject = new MoveBackward();
      }
      if (command == 'l') {
        commandObject = new TurnLeft();
      }
      if (command == 'r') {
        commandObject = new TurnRight();
      }
      if (commandObject != null) {
        coordinates = commandObject.execute(getPosition());
      }
    }
  }

  public Vector getPosition() {
    return this.coordinates;
  }

  public void execute(String commands) {
    execute(commands.toCharArray());
  }
}
