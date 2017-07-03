package prob2;

/**
 * Created by Bi on 7/2/17.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super(new CannotFly(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
