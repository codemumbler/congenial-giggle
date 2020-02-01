package io.github.codemumbler.marsrover;

public interface Sensor {

  boolean isClear(Vector vector, MarsRoverStrategy command);
}
