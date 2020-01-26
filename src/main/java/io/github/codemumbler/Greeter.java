package io.github.codemumbler;

import java.util.Calendar;

public class Greeter {

  public static final String HELLO = "Hello";
  public static final String GOOD_MORNING = "Good morning";
  private Calendar calendar;

  public String greet(String name) {
    String greeting = HELLO;
    name = name.trim();
    if (getCalendar().get(Calendar.HOUR_OF_DAY) >= 6) {
      greeting = GOOD_MORNING;
    }
    return String.format("%s %s%s", greeting, name.substring(0, 1).toUpperCase(), name.substring(1));
  }

  void setCalendar(Calendar calendar) {
    this.calendar = calendar;
  }

  private Calendar getCalendar() {
    if (calendar == null) {
      calendar = Calendar.getInstance();
    }
    return this.calendar;
  }
}
