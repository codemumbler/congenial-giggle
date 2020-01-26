package io.github.codemumbler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

  private Greeter greeter;

  @BeforeEach
  public void setUp() {
    greeter = new Greeter();
  }

  @Test
  public void greetName() {
    assertEquals("Hello Name", greeter.greet("Name"));
  }

  @Test
  public void greetNameTrimmed() {
    assertEquals("Hello Name", greeter.greet(" Name "));
  }

  @Test
  public void greetNameCapitalized() {
    assertEquals("Hello Name", greeter.greet("name"));
  }
}
