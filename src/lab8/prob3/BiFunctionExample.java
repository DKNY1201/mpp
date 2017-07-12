package lab8.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 * Created by Bi on 7/12/17.
 */
public class BiFunctionExample {
    public static void main(String[] args) {
        class MyBiFunction implements BiFunction<Double, Double, List<Double>> {

            /**
             * Applies this function to the given arguments.
             *
             * @param x  the first function argument
             * @param y the second function argument
             * @return the function result
             */
            @Override
            public List<Double> apply(Double x, Double y) {
                List<Double> list = new ArrayList<>();
                list.add(Math.pow(x, y));
                list.add(x * y);
                return list;
            }
        }

        MyBiFunction myBiFunction = new MyBiFunction();
        System.out.println(myBiFunction.apply(2.0, 3.0));
    }
}
