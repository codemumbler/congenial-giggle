package io.github.codemumbler;

public class Greeter {

  public String greet(String name) {
    name = name.trim();
    return String.format("Hello %s%s", name.substring(0, 1).toUpperCase(), name.substring(1));
  }
}
