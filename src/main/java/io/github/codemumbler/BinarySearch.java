package io.github.codemumbler;

import java.util.NoSuchElementException;

public class BinarySearch<T extends Comparable<T>> {

  private BinaryNode head;

  public T search(T element) {
    return search(head, element).getValue();
  }

  private BinaryNode search(BinaryNode node, T element) {
    if (node == null)
      throw new NoSuchElementException();
    int compare = node.getValue().compareTo(element);
    if (compare == 0) {
      return node;
    }
    if (node.getValue().compareTo(element) > 0) {
      return search(node.getLeftNode(), element);
    }
    return search(node.getRightNode(), element);
  }

  public void add(T element) {
    head = addElement(head, element, 0);
  }

  private BinaryNode addElement(BinaryNode node, T element, int depth) {
    if (node == null) {
      return new BinaryNode(element, depth);
    }
    int compare = node.getValue().compareTo(element);
    if (compare == 0) {
      return node;
    }
    if (compare > 0) {
      node.setLeftNode(addElement(node.leftNode, element, ++depth));
    } else {
      node.setRightNode(addElement(node.rightNode, element, ++depth));
    }
    return node;
  }

  public int depth(T element) {
    return search(head, element).getDepth();
  }

  private class BinaryNode {
    private final T value;
    private int depth;
    private BinaryNode leftNode;
    private BinaryNode rightNode;

    private BinaryNode(T element, int depth) {
      this.value = element;
      this.depth = depth;
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

    public int getDepth() {
      return this.depth;
    }
  }
}
