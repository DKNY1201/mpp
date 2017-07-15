package prob10;

import java.util.Arrays;
import java.util.stream.Stream;

public class Prob10B {

	public static void main(String[] args) {
		Stream<String> stringStream = Arrays.asList("Bill", "Thomas", "Mary").stream();
		System.out.println(stringStream.reduce((x, y) -> x + ", " + y)
									   .orElse("Empty list"));
	}
}
