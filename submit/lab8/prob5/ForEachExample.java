package lab8.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		// print each element of the list in upper case format

		// a
		System.out.println("Question a:");
		System.out.println("----------------------------------------");
		list.forEach(param -> System.out.println(param.toUpperCase()));

		// b
		System.out.println("\nQuestion b:");
		System.out.println("----------------------------------------");
		Consumer<String> print = System.out::println;
		list.forEach(print.andThen(String::toUpperCase));

		// bonus
		System.out.println("\nBonus:");
		System.out.println("----------------------------------------");
		list.stream()
			.map(String::toUpperCase)
			.forEach(System.out::println);
	}
}