package lab9.part2.prob10;

import java.util.stream.IntStream;

/**
 * Created by Bi on 7/14/17.
 */
public class C {

    public static IntStream myIntStream() {
        return IntStream.iterate(1, n -> n + 2).limit(10);
    }
    public static void main(String[] args) {
        System.out.println(myIntStream().max().orElse(0));
        System.out.println(myIntStream().min().orElse(0));
    }
}
