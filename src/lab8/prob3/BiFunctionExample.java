package lab8.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 * Created by Bi on 7/12/17.
 */
public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Double, Double, List<Double>> lamda = (x,y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add((double) (x*y));
            return list;
        };

        System.out.println(lamda.apply(2.0, 3.0));
    }
}