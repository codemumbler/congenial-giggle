package io.github.codemumbler;

import java.util.Calendar;

public class Greeter {

  private static final String HELLO = "Hello";
  private static final String GOOD_MORNING = "Good morning";
  private static final String GOOD_EVENING = "Good evening";
  private static final String GOOD_NIGHT = "Good night";
  private Calendar calendar;

  public String greet(String name) {
    String greeting = HELLO;
    name = name.trim();
    int hourOfTheDay = getCalendar().get(Calendar.HOUR_OF_DAY);
    if (hourOfTheDay >= 6 && hourOfTheDay < 12) {
      greeting = GOOD_MORNING;
    }
    if (hourOfTheDay >= 18 && hourOfTheDay < 22) {
      greeting = GOOD_EVENING;
    }
    if (hourOfTheDay >= 22 || hourOfTheDay < 6) {
      greeting = GOOD_NIGHT;
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
