package io.github.codemumbler.marsrover;

public class MarsRover {

  private static final char FORWARD = 'f';
  private static final char BACKWARD = 'b';
  private static final char TURN_LEFT = 'l';
  private static final char TURN_RIGHT = 'r';
  private Vector coordinates;
  private final Sensor sensor;
  private final StringBuilder commandsCompleted = new StringBuilder();

  public MarsRover(Sensor sensor) {
    this(0, 0, Vector.DIRECTION.N, sensor);
  }

  public MarsRover(int x, int y, Vector.DIRECTION direction, Sensor sensor) {
    this.coordinates = new Vector(x, y, direction);
    this.sensor = sensor;
  }

  public void execute(char... commands) {
    for (char command : commands) {
      Command commandObject = buildCommand(command);
      if (commandObject != null) {
        coordinates = commandObject.execute(getPosition());
        commandsCompleted.append(command);
      }
    }
  }

  public Vector getPosition() {
    return this.coordinates;
  }

  public void execute(String commands) {
    execute(commands.toCharArray());
  }

  private Command buildCommand(char command) {
    if (command == FORWARD) {
      return checkAndMoveForward();
    }
    if (command == BACKWARD) {
      return checkAndMoveBackwards();
    }
    if (command == TURN_LEFT) {
      return new TurnLeft();
    }
    if (command == TURN_RIGHT) {
      return new TurnRight();
    }
    return null;
  }

  private Command checkAndMoveBackwards() {
    if (isNotClear(new MoveBackward())) {
      throw new MarsRoverObstacleException(commandsCompleted.toString());
    }
    return new MoveBackward();
  }

  private Command checkAndMoveForward() {
    if (isNotClear(new MoveForward())) {
      throw new MarsRoverObstacleException(commandsCompleted.toString());
    }
    return new MoveForward();
  }

  private boolean isNotClear(Command command) {
    return !sensor.isClear(this.coordinates, command);
  }
}
