package prob5;

import java.util.Arrays;
import java.util.List;

public class GenericFindSecondSmallest {
	public static <T extends Comparable<T>> T secondSmallest(List<T> list){
		T smallest = list.get(0);
		T secondSmallest = null;
		for (T t : list) {
			if (t.compareTo(smallest) < 0){
				secondSmallest = smallest;
				smallest = t;
			}else if (t.compareTo(smallest) > 0){
				if (secondSmallest == null || t.compareTo(secondSmallest) < 0)
					secondSmallest = t;
			}
			
		}
		return secondSmallest;
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(34,23,213,324,12,21);
		System.out.println(secondSmallest(list));
	}
}
