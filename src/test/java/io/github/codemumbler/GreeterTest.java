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
    setTime(5);
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
    setTime(6);
    assertEquals("Good morning Name", greeter.greet("name"));
  }

  private void setTime(int hourOfDay) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
    greeter.setCalendar(calendar);
  }

  @Test
  public void greetAfterTheMorning() {
    setTime(12);
    assertEquals("Hello Name", greeter.greet("name"));
  }

  @Test
  public void greetInTheEvening() {
    setTime(18);
    assertEquals("Good evening Name", greeter.greet("name"));
  }

  @Test
  public void greetEveningUntilNight() {
    setTime(22);
    assertEquals("Hello Name", greeter.greet("name"));
  }
}
