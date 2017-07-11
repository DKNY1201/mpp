package prob4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		list.forEach(consumer);
	}
	
	//implement a Consumer
	static Consumer<String> consumer = new Consumer<String>() {

		@Override
		public void accept(String t) {
			System.out.println(t.toUpperCase());
		}
	};
	
}