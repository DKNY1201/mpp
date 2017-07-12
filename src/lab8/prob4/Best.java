package lab8.prob4;

import java.util.List;
import java.util.stream.Collectors;

public class Best {
	final UltraFunction<List<String>, Character, Character, Integer, Integer> countWords
			= (words, c, d, len) -> words.stream()
			.filter(word -> word.indexOf(c) >= 0)
			.filter(word -> word.indexOf(d) == -1)
			.filter(word -> word.length() == len)
			.collect(Collectors.toList()).size();

	final int numOfWords = countWords.apply(Folks.friends,'a', 'N', 4);


	public static void main(String[] args) {
		Best adv = new Best();

		System.out.println("Number of words match condition is "
				+ adv.numOfWords);
	}
}
