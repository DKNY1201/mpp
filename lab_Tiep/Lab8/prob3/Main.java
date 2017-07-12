package prob3;

import java.util.*;
import java.util.function.BiFunction;

public class Main {
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
