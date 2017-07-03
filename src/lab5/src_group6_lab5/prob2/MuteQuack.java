package prob2;

/**
 * Created by Bi on 7/2/17.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("cannot quack");
    }
}
