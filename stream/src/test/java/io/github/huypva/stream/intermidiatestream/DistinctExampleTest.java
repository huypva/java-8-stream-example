package io.github.huypva.stream.intermidiatestream;

import io.github.huypva.stream.MainTest;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class DistinctExampleTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void withoutDuplicate() {
    System.setOut(new PrintStream(outputStreamCaptor));
    DistinctExample.withoutDuplicate(MainTest.NUMBERS);

    Assertions.assertEquals(
        "===Distinct Example===\n" + "1\n" + "2\n" + "4\n" + "3\n" + "7\n" + "5\n" + "6",
        outputStreamCaptor.toString().trim());
  }
}