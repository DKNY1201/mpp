package prob2;

import java.util.Arrays;
import java.util.List;

public class Capture {
	public static void reverse(List<?> list) {
		reverseHelper(list);
	}
	
	public static <T> void reverseHelper(List<T> list){
		if (list == null || list.isEmpty()) return;
		for (int i = 0, j = list.size()-1; i <= list.size()/2; i++,j--){
			swap(list,i,j);
		}
	}
	
	public static <T> void swap(List<T> list, int x, int y) {
		T tmp = list.get(y);
		list.set(y, list.get(x));
		list.set(x, tmp);
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","2","3","4","5");
		reverse(list);
		System.out.println(list);
	}
}
