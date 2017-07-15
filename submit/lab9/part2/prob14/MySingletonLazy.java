package lab9.part2.prob14;

import java.util.Optional;

/**
 * Created by Bi on 7/14/17.
 */
public class MySingletonLazy {
    private static int count = 0;
    private static MySingletonLazy instance = null;

    private MySingletonLazy() {
        System.out.println(++count);
    }

    public static MySingletonLazy getInstance() {
        Optional<MySingletonLazy> mySingletonLazyOptional = Optional.ofNullable(instance);
        if (mySingletonLazyOptional.isPresent()) {
            return mySingletonLazyOptional.get();
        } else {
            instance = new MySingletonLazy();
            return instance;
        }
    }
}