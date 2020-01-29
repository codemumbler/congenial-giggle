package io.github.codemumbler;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BinarySearchTest {

  private BinarySearch<Integer> binarySearch;

  @BeforeEach
  public void setUp() {
    binarySearch = new BinarySearch<>();
  }

  @Test
  public void singleInteger() {
    binarySearch.add(5);
    assertEquals(5, binarySearch.search(5));
  }

  @Test
  public void notFound() {
    binarySearch.add(5);
    assertThrows(NoSuchElementException.class, () -> binarySearch.search(1));
  }

  //  @Test
  //  public void multipleIntegers() {
  //    binarySearch.add(1);
  //    binarySearch.add(3);
  //    assertEquals(1, binarySearch.search(1));
  //  }
}
