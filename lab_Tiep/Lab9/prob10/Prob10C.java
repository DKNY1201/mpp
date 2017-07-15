package prob10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prob10C {

	public static void main(String[] args) {
		List<Integer> listInteger = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		Stream<Integer> myIntStream = listInteger.stream();
		
		System.out.println(myIntStream.filter(x -> x == Collections.max(listInteger) || 
												   x == Collections.min(listInteger))
									  .collect(Collectors.toList()));
		
	}
}
