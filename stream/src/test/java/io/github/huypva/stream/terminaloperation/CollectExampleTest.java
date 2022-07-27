package io.github.huypva.stream.terminaloperation;

import io.github.huypva.stream.MainTest;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class CollectExampleTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void collectWithoutEmpty() {
    System.setOut(new PrintStream(outputStreamCaptor));
    CollectExample.collectWithoutEmpty(MainTest.STRINGS);
    Assertions.assertEquals(
        "===Collect Example===\n" + "a\n" + "b\n" + "c\n" + "ab\n" + "ef",
        outputStreamCaptor.toString().trim());
  }
}