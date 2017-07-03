package prob2;

/**
 * Created by Bi on 7/2/17.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
