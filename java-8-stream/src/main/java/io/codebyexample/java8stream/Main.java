package io.codebyexample.java8stream;

import io.codebyexample.java8stream.intermidiatestream.DistinctExample;
import io.codebyexample.java8stream.intermidiatestream.FilterExample;
import io.codebyexample.java8stream.intermidiatestream.LimitExample;
import io.codebyexample.java8stream.intermidiatestream.MapExample;
import io.codebyexample.java8stream.stream.ParallelStreamExample;
import io.codebyexample.java8stream.terminaloperation.ReduceExample;
import io.codebyexample.java8stream.intermidiatestream.SortedExample;
import io.codebyexample.java8stream.terminaloperation.CollectExample;
import io.codebyexample.java8stream.terminaloperation.ForEachExample;
import io.codebyexample.java8stream.terminaloperation.MatchExample;
import io.codebyexample.java8stream.terminaloperation.MinMaxExample;
import java.util.Arrays;
import java.util.List;

/**
 * @author huypva
 */
public class Main {

  public static List<String> STRINGS = Arrays.asList("a", "", "b", "c", "ab","", "ef");
  public static List<Integer> NUMBERS = Arrays.asList(1, 2, 4 , 3, 7, 3, 5, 2, 6);


  public static void main(String[] args) {

    FilterExample.countEmpty(STRINGS);

    LimitExample.printFiveFirst(NUMBERS);

    MapExample.doubleValue(NUMBERS);

    ParallelStreamExample.countEmpty(STRINGS);

    SortedExample.sorted(NUMBERS);

    ForEachExample.printList(NUMBERS);

    CollectExample.collectWithoutEmpty(STRINGS);

    DistinctExample.withoutDuplicate(NUMBERS);

    ReduceExample.sum(NUMBERS);

    MinMaxExample.minNumber(NUMBERS);

    MinMaxExample.maxLengthString(STRINGS);

    MatchExample.isContainOdd(NUMBERS);

    MatchExample.isOddList(NUMBERS);
  }
}
