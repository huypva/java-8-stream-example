package io.github.huypva.stream.intermidiatestream;

import java.util.List;

/**
 * @author huypva
 */
public class DistinctExample {

  public static void withoutDuplicate(List<Integer> numbers) {
    System.out.println("===Distinct Example===");

    numbers.stream()
        .distinct()
        .forEach(System.out::println);
  }

}
