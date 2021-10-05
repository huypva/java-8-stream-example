package io.codebyexample.java8stream.intermidiatestream;

import java.util.List;

/**
 * @author huypva
 */
public class SortedExample {

  public static void sorted(List<Integer> numbers) {
    System.out.println("===Sorted Example===");

    numbers.stream()
        .sorted((x,y) -> y - x)
        .forEach(System.out::println);
  }

}
