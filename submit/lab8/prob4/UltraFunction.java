package lab8.prob4;

/**
 * Created by Bi on 7/11/17.
 */
@FunctionalInterface
public interface UltraFunction<A, B, C, D, E> {
    E apply(A a, B b, C c, D d);
}
