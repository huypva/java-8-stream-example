package io.codebyexample.java8stream.terminaloperation;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author huypva
 */
public class CollectExample {

  public static void collectWithoutEmpty(List<String> strings) {
    System.out.println("===Collect Example===");

    List<String> notEmptyList = strings.stream()
        .filter(string -> string != null && !string.isEmpty())
        .collect(Collectors.toList());

    notEmptyList.forEach(System.out::println);
  }
}
