package io.codebyexample.java8stream.stream;

import java.util.List;

/**
 * @author huypva
 */
public class ParallelStreamExample {

  public static void countEmpty(List<String> strings) {
    System.out.println("===ParallelStream Example===");

    long count = strings.parallelStream()
        .filter(string -> string == null || string.isEmpty())
        .count();

    System.out.println("Number empty: " + count);
  }

}
