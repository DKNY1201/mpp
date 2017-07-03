package prob2;

/**
 * Created by Bi on 7/2/17.
 */
abstract public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

//    public Duck() {
//
//    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("swimming");
    }

    abstract public void display();
}
