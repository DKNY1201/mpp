package lab7.prob4_quy;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		list.forEach(new ToUpper());
		
	}
	
	//implement a Consumer
	static class ToUpper implements Consumer<String> {

		/**
		 * Performs this operation on the given argument.
		 *
		 * @param s the input argument
		 */
		@Override
		public void accept(String s) {
			System.out.println(s.toUpperCase());
		}
	}

	
	
}