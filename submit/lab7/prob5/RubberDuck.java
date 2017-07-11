package lab7.prob5;

/**
 * Created by Bi on 7/2/17.
 */
public class RubberDuck extends Duck {

    RubberDuck(){}

    @Override
    public void display() {
        System.out.println("displaying");
    }

    @Override
    public String flyBehavior() {
        return "cannot fly";
    }

    @Override
    public String quackBehavior() {
        return "squeaking";
    }
}
