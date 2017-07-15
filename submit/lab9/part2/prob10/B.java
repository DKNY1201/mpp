package lab9.part2.prob10;

import java.util.Arrays;

/**
 * Created by Bi on 7/14/17.
 */
public class B {
    public static void main(String[] args) {
        System.out.println(Arrays.asList("Bill","Thomas","Mary")
                .stream()
                .reduce((x, y) -> x + ", " + y)
                .orElse("List of String is empty"));
    }
}
