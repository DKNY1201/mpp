package lab9.part2.prob10;

import java.util.stream.IntStream;

/**
 * Created by Bi on 7/14/17.
 */
public class A {
    public static void main(String[] args) {
        IntStream ones = IntStream.generate(() -> 1).limit(10).distinct();
        ones.forEach(System.out::println);
    }
}
