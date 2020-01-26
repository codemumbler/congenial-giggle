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
    if (isTheMorning(hourOfTheDay)) {
      greeting = GOOD_MORNING;
    }
    if (isTheEvening(hourOfTheDay)) {
      greeting = GOOD_EVENING;
    }
    if (isTheNight(hourOfTheDay)) {
      greeting = GOOD_NIGHT;
    }
    String fullGreeting = String.format("%s %s%s", greeting, name.substring(0, 1).toUpperCase(), name.substring(1));
    System.out.println(fullGreeting);
    return fullGreeting;
  }

  private boolean isTheNight(int hourOfTheDay) {
    return hourOfTheDay >= 22 || hourOfTheDay < 6;
  }

  private boolean isTheEvening(int hourOfTheDay) {
    return hourOfTheDay >= 18 && hourOfTheDay < 22;
  }

  private boolean isTheMorning(int hourOfTheDay) {
    return hourOfTheDay >= 6 && hourOfTheDay < 12;
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
