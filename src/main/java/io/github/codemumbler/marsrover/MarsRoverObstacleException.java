package io.github.codemumbler.marsrover;

public class MarsRoverObstacleException extends RuntimeException {

  private final String commandsCompleted;

  MarsRoverObstacleException(String commandsCompleted) {
    super("The commands completed were: " + commandsCompleted);
    this.commandsCompleted = commandsCompleted;
  }

  public String getCommandsCompleted() {
    return this.commandsCompleted;
  }
}
