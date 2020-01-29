package io.github.codemumbler;

import java.util.NoSuchElementException;

public class BinarySearch<T> {

  private BinaryNode head;

  public T search(T element) {
    if (head.getValue().equals(element))
      return element;
    throw new NoSuchElementException();
  }

  public void add(T element) {
    if (head == null) {
      head = new BinaryNode(element);
    }
  }

  private class BinaryNode {
    private final T value;

    public BinaryNode(T element) {
      this.value = element;
    }

    public T getValue() {
      return value;
    }
  }
}
