package lab7.prob5_quy;

/**
 * Created by Bi on 7/2/17.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck(){}

    @Override
    public void display() {
        System.out.println("displaying");
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
