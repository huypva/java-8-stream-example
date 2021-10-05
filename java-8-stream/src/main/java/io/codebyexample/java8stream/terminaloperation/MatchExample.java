package io.codebyexample.java8stream.terminaloperation;

import java.util.List;

/**
 * @author huypva
 */
public class MatchExample {

  public static void isContainOdd(List<Integer> numbers) {
    System.out.println("===Match Example - Max===");

    boolean isContainOdd = numbers.stream()
        .anyMatch(x -> x % 2 == 1);

    System.out.println("isContainOdd: " + isContainOdd);
  }

  public static void isOddList(List<Integer> numbers) {
    System.out.println("===Match Example - Max===");

    boolean isOddList = numbers.stream()
        .allMatch(x -> x % 2 == 1);

    System.out.println("isContainOdd: " + isOddList);
  }

}
