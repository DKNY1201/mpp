package lab9.part2.prob12;

/**
 * Created by Bi on 7/14/17.
 */
@FunctionalInterface
public interface TriFunction<X, Y, Z, R> {
    R apply(X x, Y y, Z z);
}
