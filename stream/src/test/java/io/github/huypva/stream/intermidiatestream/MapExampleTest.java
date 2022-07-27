package io.github.huypva.stream.intermidiatestream;

import io.github.huypva.stream.MainTest;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class MapExampleTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void doubleValue() {
    System.setOut(new PrintStream(outputStreamCaptor));
    MapExample.doubleValue(MainTest.NUMBERS);
    Assertions.assertEquals(
        "===Map Example===\n"
            + "2\n"
            + "4\n"
            + "8\n"
            + "6\n"
            + "14\n"
            + "6\n"
            + "10\n"
            + "4\n"
            + "12",
        outputStreamCaptor.toString().trim());
  }
}