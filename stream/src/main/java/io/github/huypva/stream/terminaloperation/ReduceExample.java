package io.github.huypva.stream.terminaloperation;

import java.util.List;

/**
 * @author huypva
 */
public class ReduceExample {

  public static void sum(List<Integer> numbers) {
    System.out.println("===Reduce Example===");

    int sum = numbers.stream()
        .reduce((x,y) -> x + y).get();
    System.out.println("Sum: " + sum);
  }
}
