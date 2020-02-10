package io.github.codemumbler.marsrover;

public class MarsRover {

  private static final char FORWARD = 'f';
  private static final char BACKWARD = 'b';
  private static final char TURN_LEFT = 'l';
  private static final char TURN_RIGHT = 'r';

  private Vector coordinates;
  private final Sensor sensor;
  private final CommandHistory commandHistory;

  public MarsRover(Sensor sensor) {
    this(0, 0, Vector.DIRECTION.N, sensor);
  }

  public MarsRover(int x, int y, Vector.DIRECTION direction, Sensor sensor) {
    this.coordinates = new Vector(x, y, direction);
    this.sensor = sensor;
    this.commandHistory = new CommandHistory();
  }

  public void execute(char... commands) {
    for (char command : commands) {
      executeCommand(buildCommand(command));
      commandHistory.addCompletedCommand(command);
    }
  }

  public Vector getPosition() {
    return this.coordinates;
  }

  public void execute(String commands) {
    execute(commands.toCharArray());
  }

  private void executeCommand(Command commandObject) {
    if (commandObject != null) {
      coordinates = commandObject.execute(getPosition());
    }
  }

  private Command buildCommand(char command) {
    switch (command) {
      case FORWARD:
        return checkAndMoveForward();
      case BACKWARD:
        return checkAndMoveBackwards();
      case TURN_LEFT:
        return new TurnLeft();
      case TURN_RIGHT:
        return new TurnRight();
      default:
        return null;
    }
  }

  private Command checkAndMoveBackwards() {
    if (isNotClear(new MoveBackward())) {
      throw new MarsRoverObstacleException(commandHistory.history.toString());
    }
    return new MoveBackward();
  }

  private Command checkAndMoveForward() {
    if (isNotClear(new MoveForward())) {
      throw new MarsRoverObstacleException(commandHistory.history.toString());
    }
    return new MoveForward();
  }

  private boolean isNotClear(Command command) {
    return !sensor.isClear(this.coordinates, command);
  }
}
