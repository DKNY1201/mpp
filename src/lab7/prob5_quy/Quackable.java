package lab7.prob5_quy;

/**
 * Created by Bi on 7/11/17.
 */
public interface Quackable {
    String quackBehavior();
    default void quack() {
        System.out.println(quackBehavior());
    }
}
