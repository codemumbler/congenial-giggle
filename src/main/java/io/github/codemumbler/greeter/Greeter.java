package io.github.codemumbler.greeter;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Greeter {

  private static final String HELLO = "Hello";
  private static final String GOOD_MORNING = "Good morning";
  private static final String GOOD_EVENING = "Good evening";
  private static final String GOOD_NIGHT = "Good night";
  private static final Logger logger = Logger.getLogger(Greeter.class.getName());
  private Calendar calendar;

  public String greet(String name) {
    String greeting = HELLO;
    name = name.trim();
    int hourOfTheDay = getCalendar().get(Calendar.HOUR_OF_DAY);
    if (isTheMorning(hourOfTheDay)) {
      greeting = GOOD_MORNING;
    } else if (isTheEvening(hourOfTheDay)) {
      greeting = GOOD_EVENING;
    } else if (isTheNight(hourOfTheDay)) {
      greeting = GOOD_NIGHT;
    }
    String fullGreeting = String.format("%s %s%s", greeting, name.substring(0, 1).toUpperCase(), name.substring(1));
    log(fullGreeting);
    return fullGreeting;
  }

  void log(String fullGreeting) {
    logger.log(Level.FINE, fullGreeting);
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

  private Calendar getCalendar() {
    if (calendar == null) {
      calendar = Calendar.getInstance();
    }
    return this.calendar;
  }

  void setCalendar(Calendar calendar) {
    this.calendar = calendar;
  }
}
