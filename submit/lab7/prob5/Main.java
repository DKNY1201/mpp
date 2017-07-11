package lab7.prob5;

/**
 * Created by Bi on 7/2/17.
 */
public class Main {
    public static void main(String[] args) {
        Duck[] ducks = {
                new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()
        };

        for (Duck d: ducks) {
            System.out.println(d.getClass().getSimpleName() + ":");
            d.display();
            d.fly();
            d.quack();
            d.swim();
        }
    }
}
