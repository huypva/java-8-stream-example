package io.github.huypva.stream.intermidiatestream;

import io.github.huypva.stream.MainTest;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class LimitExampleTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void printFiveFirst() {
    System.setOut(new PrintStream(outputStreamCaptor));
    LimitExample.printFiveFirst(MainTest.NUMBERS);
    Assertions.assertEquals(
        "===Limit Example===\n" + "1\n" + "2\n" + "4\n" + "3\n" + "7",
        outputStreamCaptor.toString().trim());
  }
}