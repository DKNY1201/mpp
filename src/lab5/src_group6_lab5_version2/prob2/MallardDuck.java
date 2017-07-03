package prob2;

/**
 * Created by Bi on 7/2/17.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
