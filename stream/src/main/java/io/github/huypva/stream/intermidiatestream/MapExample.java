package io.github.huypva.stream.intermidiatestream;

import java.util.List;

/**
 * @author huypva
 */
public class MapExample {

  public static void doubleValue(List<Integer> numbers) {
    System.out.println("===Map Example===");

    numbers.stream()
        .map(i -> i*2)
        .forEach(System.out::println);
  }

}
