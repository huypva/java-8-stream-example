package io.github.huypva.stream.intermidiatestream;

import io.github.huypva.stream.MainTest;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class FilterExampleTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void countEmpty() {
    System.setOut(new PrintStream(outputStreamCaptor));
    FilterExample.countEmpty(MainTest.STRINGS);
    Assertions.assertEquals(
        "===Filter Example===\n" + "Number empty: 2", outputStreamCaptor.toString().trim());
  }
}