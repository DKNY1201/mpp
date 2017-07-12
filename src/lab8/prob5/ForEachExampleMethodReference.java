package lab8.prob5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class ForEachExampleMethodReference {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");

		Function<List<String>, List<String>> toUpper = listStr -> listStr
				.stream()
				.map(str -> str.toUpperCase())
				.collect(Collectors.toList());
		List<String> upperList = toUpper.apply(list);
		upperList.forEach(System.out::println);
	}

}