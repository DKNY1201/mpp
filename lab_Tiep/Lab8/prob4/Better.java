package prob4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Better {

	final Function<Integer, Predicate<String>> hasLength = lenght -> word -> lenght == word.length();
	final Function<Character, Predicate<String>> containChar = character -> word -> word.indexOf(character) >= 0;
	final Function<Character, Predicate<String>> notContainChar = character -> word -> word.indexOf(character) < 0;
	final List<String> wordsWithPredicates = Arrays.asList(new String[]{"tiep","quy"}).stream()
																					  .filter(hasLength.apply(4))
																					  .filter(containChar.apply('t'))
																					  .filter(notContainChar.apply('y'))
																					  .collect(Collectors.toList());

	public static void main(String[] args) {
		Better better = new Better();
		System.out.println(better.wordsWithPredicates.size());
	}

}