package io.github.codemumbler;

import java.util.NoSuchElementException;

public class BinarySearch<T extends Comparable<T>> {

  private BinaryNode head;

  public T search(T element) {
    return search(head, element);
  }

  private T search(BinaryNode head, T element) {
    if (head == null)
      throw new NoSuchElementException();
    if (head.getValue().equals(element))
      return element;
    return search(head.getLeftNode(), element);
  }

  public void add(T element) {
    if (head == null) {
      head = new BinaryNode(element);
    } else {
      if (head.getValue().compareTo(element) > 0) {
        head.addLeftNode(element);
      }
    }
  }

  private class BinaryNode {
    private final T value;
    private BinaryNode leftNode;

    private BinaryNode(T element) {
      this.value = element;
    }

    private T getValue() {
      return this.value;
    }

    private void addLeftNode(T element) {
      this.leftNode = new BinaryNode(element);
    }

    public BinaryNode getLeftNode() {
      return this.leftNode;
    }
  }
}
