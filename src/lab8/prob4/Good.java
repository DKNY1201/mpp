package lab8.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Good {
	public static void main(final String[] args) {
		Good good = new Good();

		System.out.println("Number of words match condition is "
				+ good.countWords( Folks.friends, 'a', 'N', 4));
	}

	public int countWords(List<String> words, char c, char d, int len) {
		return words.stream()
				.filter(word -> word.indexOf(c) >= 0)
				.filter(word -> word.indexOf(d) == -1)
				.filter(word -> word.length() == len)
				.collect(Collectors.toList()).size();
	}
}
