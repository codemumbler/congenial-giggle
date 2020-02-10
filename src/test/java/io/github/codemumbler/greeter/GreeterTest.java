package io.github.codemumbler.greeter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GreeterTest {

  public static final String HELLO_NAME = "Hello Name";
  private Greeter greeter;
  private TestLogHandler handler;
  private Level level;

  @BeforeEach
  public void setUp() {
    greeter = new Greeter();
    setTime(13);

    Logger logger = Logger.getLogger(Greeter.class.getName());
    level = logger.getLevel();
    handler = new TestLogHandler();
    handler.setLevel(Level.ALL);
    logger.setUseParentHandlers(false);
    logger.addHandler(handler);
    logger.setLevel(Level.ALL);
  }

  @AfterEach
  public void tearDown() {
    Logger logger = Logger.getLogger(Greeter.class.getName());
    logger.setUseParentHandlers(true);
    logger.removeHandler(handler);
    logger.setLevel(level);
  }

  @Test
  public void greetName() {
    assertEquals(HELLO_NAME, doGreeting());
  }

  @Test
  public void greetNameTrimmed() {
    assertEquals(HELLO_NAME, doGreeting());
  }

  @Test
  public void greetNameCapitalized() {
    assertEquals(HELLO_NAME, doGreeting());
  }

  @Test
  public void greetInTheMorning() {
    setTime(6);
    assertEquals("Good morning Name", doGreeting());
  }

  private void setTime(int hourOfDay) {
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
    greeter.setCalendar(calendar);
  }

  @Test
  public void greetAfterTheMorning() {
    setTime(12);
    assertEquals(HELLO_NAME, doGreeting());
  }

  @Test
  public void greetInTheEvening() {
    setTime(18);
    assertEquals("Good evening Name", doGreeting());
  }

  @Test
  public void greetNight() {
    setTime(22);
    assertEquals("Good night Name", doGreeting());
  }

  @Test
  public void greetLateNight() {
    setTime(5);
    assertEquals("Good night Name", doGreeting());
  }

  @Test
  public void noCalendar() {
    greeter.setCalendar(null);
    assertTrue(doGreeting().length() > 0);
  }

  private String doGreeting() {
    return greeter.greet(" name ");
  }

  @Test
  public void greetLogs() {
    doGreeting();
    assertEquals(HELLO_NAME, handler.message);
  }

  static class TestLogHandler extends Handler {
    String message = "";

    public void publish(LogRecord record) {
      message = record.getMessage();
    }

    public void close() {
    }

    public void flush() {
    }
  }
}
