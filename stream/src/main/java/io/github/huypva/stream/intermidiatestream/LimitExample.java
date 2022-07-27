package io.github.huypva.stream.intermidiatestream;

import java.util.List;

/**
 * @author huypva
 */
public class LimitExample {

  public static void printFiveFirst(List<Integer> numbers) {
    System.out.println("===Limit Example===");

    numbers.stream()
        .limit(5)
        .forEach(System.out::println);

  }

}
