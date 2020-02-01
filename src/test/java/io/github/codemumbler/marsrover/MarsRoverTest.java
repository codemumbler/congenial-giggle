package io.github.codemumbler.marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

  private MarsRover marsRover;
  private Sensor sensor;

  @BeforeEach
  public void setUp() {
    sensor = (vector, command) -> true;
    marsRover = new MarsRover(sensor);
  }

  @Test
  public void getPosition() {
    assertEquals("Vector{direction=N, x=0, y=0}", marsRover.getPosition().toString());
  }

  @Test
  public void setStartPosition() {
    marsRover = new MarsRover(1, 1, Vector.DIRECTION.E, sensor);
    assertEquals("Vector{direction=E, x=1, y=1}", marsRover.getPosition().toString());
  }

  @Test
  public void moveForward() {
    marsRover.execute('f');
    assertEquals("Vector{direction=N, x=0, y=1}", marsRover.getPosition().toString());
  }

  @Test
  public void turnLeft() {
    marsRover.execute('l');
    assertEquals("Vector{direction=W, x=0, y=0}", marsRover.getPosition().toString());
  }

  @Test
  public void turnRight() {
    marsRover.execute('r');
    assertEquals("Vector{direction=E, x=0, y=0}", marsRover.getPosition().toString());
  }

  @Test
  public void moveBackwards() {
    marsRover = new MarsRover(0, 1, Vector.DIRECTION.N, sensor);
    marsRover.execute('b');
    assertEquals("Vector{direction=N, x=0, y=0}", marsRover.getPosition().toString());
  }

  @Test
  public void unknownCommandNothingHappens() {
    marsRover.execute('X');
    assertEquals("Vector{direction=N, x=0, y=0}", marsRover.getPosition().toString());
  }

  @Test
  public void noCommands() {
    marsRover.execute("");
    assertEquals("Vector{direction=N, x=0, y=0}", marsRover.getPosition().toString());
  }

  @Test
  public void multipleCommands() {
    marsRover.execute("fbfrfrfrf");
    assertEquals("Vector{direction=W, x=0, y=0}", marsRover.getPosition().toString());
  }

  @Test
  public void obstacleDetectedForward() {
    sensor = (vector, command) -> false;
    marsRover = new MarsRover(sensor);
    marsRover.execute('f');
    assertEquals("Vector{direction=N, x=0, y=0}", marsRover.getPosition().toString());
  }

  @Test
  public void obstacleDetectedBackwards() {
    sensor = (vector, command) -> false;
    marsRover = new MarsRover(0, 1, Vector.DIRECTION.N, sensor);
    marsRover.execute('b');
    assertEquals("Vector{direction=N, x=0, y=1}", marsRover.getPosition().toString());
  }
}
