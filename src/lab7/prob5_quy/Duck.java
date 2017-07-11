package lab7.prob5_quy;

/**
 * Created by Bi on 7/2/17.
 */
abstract public class Duck implements Flyable, Quackable {
    public void swim() {
        System.out.println("swimming");
    }

    abstract public void display();
}
