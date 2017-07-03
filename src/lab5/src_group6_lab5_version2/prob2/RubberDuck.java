package prob2;

/**
 * Created by Bi on 7/2/17.
 */
public class RubberDuck extends Duck {

    RubberDuck() {
        super(new CannotFly(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
