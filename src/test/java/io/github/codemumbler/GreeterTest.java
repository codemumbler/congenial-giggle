package io.github.codemumbler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

  private Greeter greeter;

  @BeforeEach
  public void setUp() {
    greeter = new Greeter();
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.HOUR_OF_DAY, 5);
    greeter.setCalendar(calendar);
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

  @Test
  public void greetInTheMorning() {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.HOUR_OF_DAY, 6);
    greeter.setCalendar(calendar);
    assertEquals("Good morning Name", greeter.greet("name"));
  }
}
