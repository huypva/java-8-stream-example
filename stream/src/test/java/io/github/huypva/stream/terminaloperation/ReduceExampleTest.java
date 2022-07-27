package io.github.huypva.stream.terminaloperation;

import io.github.huypva.stream.MainTest;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class ReduceExampleTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void sum() {
    System.setOut(new PrintStream(outputStreamCaptor));
    ReduceExample.sum(MainTest.NUMBERS);
    Assertions.assertEquals(
        "===Reduce Example===\n" + "Sum: 33", outputStreamCaptor.toString().trim());
  }
}