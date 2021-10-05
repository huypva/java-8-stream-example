package io.codebyexample.java8stream.terminaloperation;

import java.util.List;

/**
 * @author huypva
 */
public class ForEachExample {

  public static void printList(List<Integer> numbers) {
    System.out.println("===ForEach Example===");

    numbers.stream()
        .forEach(System.out::println);
  }

}
