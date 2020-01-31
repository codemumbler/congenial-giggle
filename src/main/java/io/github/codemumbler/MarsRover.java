package io.github.codemumbler;

public class MarsRover {

  private MarsRoverVector coordinates;

  public MarsRover() {
    this(0, 0, MarsRoverVector.DIRECTION.N);
  }

  public MarsRover(int x, int y, MarsRoverVector.DIRECTION direction) {
    this.coordinates = new MarsRoverVector(x, y, direction);
  }

  public void execute(char commands) {
    if (commands == 'f') {
      //      Command command = new MoveForwardCommand(getPosition());
      //      setPosition(command.execute());
      if (coordinates.getDirection().equals(MarsRoverVector.DIRECTION.N)) {
        coordinates = new MarsRoverVector(coordinates.getX(), coordinates.getY() + 1, coordinates.getDirection());
      }
    }
    if (commands == 'l') {
      if (coordinates.getDirection().equals(MarsRoverVector.DIRECTION.N)) {
        coordinates = new MarsRoverVector(coordinates.getX(), coordinates.getY(), MarsRoverVector.DIRECTION.W);
      }
    }
  }

  public MarsRoverVector getPosition() {
    return this.coordinates;
  }
}
