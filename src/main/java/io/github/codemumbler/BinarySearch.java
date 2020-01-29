package io.github.codemumbler;

import java.util.NoSuchElementException;

public class BinarySearch<T extends Comparable<T>> {

  private BinaryNode head;

  public T search(T element) {
    return search(head, element);
  }

  private T search(BinaryNode node, T element) {
    if (node == null)
      throw new NoSuchElementException();
    if (node.getValue().equals(element))
      return element;
    if (node.getValue().compareTo(element) > 0) {
      return search(node.getLeftNode(), element);
    }
    return search(node.getRightNode(), element);
  }

  public void add(T element) {
    head = addElement(head, element);
  }

  private BinaryNode addElement(BinaryNode node, T element) {
    if (node == null) {
      return new BinaryNode(element);
    }
    if (node.getValue().compareTo(element) > 0) {
      node.setLeftNode(addElement(node.leftNode, element));
    } else {
      node.setRightNode(addElement(node.rightNode, element));
    }
    return node;
  }

  private class BinaryNode {
    private final T value;
    private BinaryNode leftNode;
    private BinaryNode rightNode;

    private BinaryNode(T element) {
      this.value = element;
    }

    private T getValue() {
      return this.value;
    }

    private void setLeftNode(BinaryNode node) {
      this.leftNode = node;
    }

    public BinaryNode getLeftNode() {
      return this.leftNode;
    }

    public void setRightNode(BinaryNode node) {
      this.rightNode = node;
    }

    public BinaryNode getRightNode() {
      return this.rightNode;
    }
  }
}
