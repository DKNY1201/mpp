package lab7.prob5_quy;

/**
 * Created by Bi on 7/11/17.
 */
public interface Flyable {
    String flyBehavior();
    default void fly() {
        System.out.println(flyBehavior());
    }
}
