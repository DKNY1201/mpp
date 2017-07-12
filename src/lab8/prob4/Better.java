package lab8.prob4;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Even more functional approach -- count number of elements 
//using a pure expression -- no auxiliary function calls
//All assignments are atomic.
public class Better {
	final Function<String, Predicate<String>> startsWithLetter 
    	= letter -> name -> name.startsWith(letter);

	final Function<String, Predicate<String>> countWords
			= letter -> name -> name.startsWith(letter);

	final UltraFunction<List<String>, Character, Character, Integer, Integer> countWords1
			= (words, c, d, len) -> words.stream()
			.filter(word -> word.indexOf(c) >= 0)
			.filter(word -> word.indexOf(d) == -1)
			.filter(word -> word.length() == len)
			.collect(Collectors.toList()).size();

	final List<String> friendsStartN = Folks.friends.stream()
			.filter(startsWithLetter.apply("N"))
			.map(friend -> friend.toUpperCase())
			.collect(Collectors.toList());
	
	final List<String>  friendsStartB = Folks.friends.stream()
			.filter(startsWithLetter.apply("B"))
			.map(friend -> friend.toUpperCase())
			.collect(Collectors.toList());
	
	public static void main(String[] args) {
		Better b = new Better();

		System.out.println("Friends with names that start"
				+ " with 'N': " + b.friendsStartN);
		System.out.println("Friends with names that start"
				+ " with 'B': " + b.friendsStartB);
	}
}
