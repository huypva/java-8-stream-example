package io.github.huypva.stream.terminaloperation;

import io.github.huypva.stream.MainTest;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class ForEachExampleTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void printList() {
    System.setOut(new PrintStream(outputStreamCaptor));
    ForEachExample.printList(MainTest.NUMBERS);
    Assertions.assertEquals(
        "===ForEach Example===\n"
            + "1\n"
            + "2\n"
            + "4\n"
            + "3\n"
            + "7\n"
            + "3\n"
            + "5\n"
            + "2\n"
            + "6",
        outputStreamCaptor.toString().trim());
  }
}