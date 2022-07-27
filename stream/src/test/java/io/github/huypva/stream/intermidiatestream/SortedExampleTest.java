package io.github.huypva.stream.intermidiatestream;

import io.github.huypva.stream.MainTest;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class SortedExampleTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void sorted() {
    System.setOut(new PrintStream(outputStreamCaptor));
    SortedExample.sorted(MainTest.NUMBERS);
    Assertions.assertEquals(
        "===Sorted Example===\n"
            + "7\n"
            + "6\n"
            + "5\n"
            + "4\n"
            + "3\n"
            + "3\n"
            + "2\n"
            + "2\n"
            + "1",
        outputStreamCaptor.toString().trim());
  }
}