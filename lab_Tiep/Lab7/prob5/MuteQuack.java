package prob5;


public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("cannot quack");
    }
}
