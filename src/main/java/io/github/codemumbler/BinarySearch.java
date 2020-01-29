package io.github.codemumbler;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class BinarySearch<T> {

  private ArrayList<T> list = new ArrayList<>();

  public T search(T element) {
    if (list.contains(element))
      return element;
    throw new NoSuchElementException();
  }

  public void add(T element) {
    list.add(element);
  }
}
