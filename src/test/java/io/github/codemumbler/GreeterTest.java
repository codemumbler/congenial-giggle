package io.github.codemumbler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

  @Test
  public void greetMe() {
    Greeter greeter = new Greeter();
    assertEquals("Hello Name", greeter.greet("Name"));
  }
}
