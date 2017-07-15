package lab9.part2.prob9;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Bi on 7/14/17.
 */
public class SquareNums {
    public static void printSquares(int num) {
        System.out.println(Stream.iterate(1, n -> n + 1).map(n -> n * n).limit(num).collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        printSquares(5);
    }
}
