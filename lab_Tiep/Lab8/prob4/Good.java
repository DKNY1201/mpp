package prob4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Good {
	public static void main(String[] args) {
		Good good = new Good();
		int count = good.countWords(Arrays.asList(new String[]{"tiep","quy"}), 't', 'y', 4);
		System.out.println(count);
		
		count = good.countWords(Arrays.asList(new String[]{"tiep","quy","lego"}), 'e', 'y', 4);
		System.out.println(count);
	}
	
	public int countWords(List<String> words, char c, char d, int len){
		return words.stream()
			 .filter(word -> word.length() == len)
			 .filter(word -> word.indexOf(c) >= 0)
			 .filter(word -> word.indexOf(d) < 0)
			 .collect(Collectors.toList())
			 .size();
	}
}
