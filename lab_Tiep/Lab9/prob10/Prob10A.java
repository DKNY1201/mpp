package prob10;

import java.util.stream.IntStream;

public class Prob10A {
	//Short Answer: when this main method run, output will be 1 in console, but program still keep running.
	//Solution: call terminal operation
//	public static void main(String[] args) {
//		IntStream ones = IntStream.generate(() -> 1).distinct();
//		ones.forEach(System.out::println);
//	}
	
	//Solution:
	public static void main(String[] args) {
		IntStream ones = IntStream.generate(() -> 1).distinct().limit(1);
		ones.forEach(System.out::println);
	}
}
