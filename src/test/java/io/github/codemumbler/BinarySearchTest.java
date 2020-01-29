package io.github.codemumbler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

  @Test
  public void searchInt() {
    BinarySearch<Integer> binarySearch = new BinarySearch<>();
    binarySearch.add(5);
    assertEquals(5, binarySearch.search(5));
  }
}
