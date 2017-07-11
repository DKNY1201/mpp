package lab7.prob5;

/**
 * Created by Bi on 7/2/17.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {}

    @Override
    public void display() {
        System.out.println("display");
    }

    @Override
    public String flyBehavior() {
        return "fly with wings";
    }

    @Override
    public String quackBehavior() {
        return "quacking";
    }
}
