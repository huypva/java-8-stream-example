package io.github.huypva.stream.terminaloperation;

import io.github.huypva.stream.MainTest;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class MatchExampleTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void isContainOdd() {
    System.setOut(new PrintStream(outputStreamCaptor));
    MatchExample.isContainOdd(MainTest.NUMBERS);
    Assertions.assertEquals(
        "===Match Example - Max===\n" + "isContainOdd: true", outputStreamCaptor.toString().trim());
  }

  @Test
  void isOddList() {
    System.setOut(new PrintStream(outputStreamCaptor));
    MatchExample.isOddList(MainTest.NUMBERS);
    Assertions.assertEquals(
        "===Match Example - Max===\n" + "isContainOdd: false",
        outputStreamCaptor.toString().trim());
  }
}