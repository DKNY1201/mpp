package lab9.part2.prob14;

import lesson5.lecture.factorymethods4.singleton.MySingleton;

import java.util.Optional;

/**
 * Created by Bi on 7/14/17.
 */
public class Main {
    public static void main(String[] args) {
        MySingletonLazy mySingletonLazy = MySingletonLazy.getInstance();
        MySingletonLazy mySingletonLazy1 = MySingletonLazy.getInstance();
        MySingletonLazy mySingletonLazy2 = MySingletonLazy.getInstance();
    }
}
