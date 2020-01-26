package io.github.codemumbler;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

  public static final String HELLO_NAME = "Hello Name";
  private Greeter greeter;
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @BeforeEach
  public void setUp() throws UnsupportedEncodingException {
    greeter = new Greeter();
    setTime(13);
    System.setOut(new PrintStream(outContent, true, StandardCharsets.UTF_8.name()));
  }

  @AfterEach
  public void tearDown() {
    System.setErr(originalOut);
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

  private String doGreeting() {
    return greeter.greet(" name ");
  }

  @Test
  public void greetLogsToConsole() throws UnsupportedEncodingException {
    doGreeting();
    assertEquals(HELLO_NAME + System.lineSeparator(), outContent.toString(StandardCharsets.UTF_8.name()));
  }
}
