package io.github.huypva.stream.terminaloperation;

import io.github.huypva.stream.MainTest;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class MinMaxExampleTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void minNumber() {
    System.setOut(new PrintStream(outputStreamCaptor));
    MinMaxExample.minNumber(MainTest.NUMBERS);
    Assertions.assertEquals(
        "===MinMax Example - Min===\n" + "Min number: 1", outputStreamCaptor.toString().trim());
  }

  @Test
  void maxLengthString() {
    System.setOut(new PrintStream(outputStreamCaptor));
    MinMaxExample.maxLengthString(MainTest.STRINGS);
    Assertions.assertEquals(
        "===MinMax Example - Max===\n" + "Max length string: ab",
        outputStreamCaptor.toString().trim());
  }
}