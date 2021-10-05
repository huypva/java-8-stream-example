package io.codebyexample.java8stream.intermidiatestream;

import java.util.List;

/**
 * @author huypva
 */
public class FilterExample {

  public static void countEmpty(List<String> strings) {
    System.out.println("===Filter Example===");

    long count = strings.stream()
        .filter(string -> string == null || string.isEmpty())
        .count();

    System.out.println("Number empty: " + count);
  }

}
