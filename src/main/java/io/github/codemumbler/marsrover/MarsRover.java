package io.github.codemumbler.marsrover;

public class MarsRover {

  private static final char FORWARD = 'f';
  private static final char BACKWARD = 'b';
  private static final char TURN_LEFT = 'l';
  private static final char TURN_RIGHT = 'r';
  private Vector coordinates;
  private final Sensor sensor;

  public MarsRover(Sensor sensor) {
    this(0, 0, Vector.DIRECTION.N, sensor);
  }

  public MarsRover(int x, int y, Vector.DIRECTION direction, Sensor sensor) {
    this.coordinates = new Vector(x, y, direction);
    this.sensor = sensor;
  }

  public void execute(char... commands) {
    for (char command : commands) {
      Command commandObject = null;
      if (command == FORWARD && isClear(new MoveForward())) {
        commandObject = new MoveForward();
      }
      if (command == BACKWARD && isClear(new MoveBackward())) {
        commandObject = new MoveBackward();
      }
      if (command == TURN_LEFT) {
        commandObject = new TurnLeft();
      }
      if (command == TURN_RIGHT) {
        commandObject = new TurnRight();
      }
      if (commandObject != null) {
        coordinates = commandObject.execute(getPosition());
      }
    }
  }

  private boolean isClear(Command command) {
    return sensor.isClear(this.coordinates, command);
  }

  public Vector getPosition() {
    return this.coordinates;
  }

  public void execute(String commands) {
    execute(commands.toCharArray());
  }
}
