package io.codebyexample.java8stream.terminaloperation;

import java.util.List;
import java.util.Optional;

/**
 * @author huypva
 */
public class MinMaxExample {

  public static void minNumber(List<Integer> numbers) {
    System.out.println("===MinMax Example - Min===");

    Optional<Integer> maxNumber = numbers.stream()
        .min((x, y) -> (x -y));
    System.out.println("Min number: " + maxNumber.orElse(null));
  }


  public static void maxLengthString(List<String> strings) {
    System.out.println("===MinMax Example - Max===");

    Optional<String> minLength = strings.stream()
        .max((x, y) -> (x.length() - y.length()));

    System.out.println("Max length string: " + minLength.orElse(null));
  }
}
