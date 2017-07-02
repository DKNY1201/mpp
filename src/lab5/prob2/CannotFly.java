package lab5.prob2;

/**
 * Created by Bi on 7/2/17.
 */
public class CannotFly implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}
