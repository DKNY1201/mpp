package prob2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyStream<T> {
	private List<T> elements;
	public static <T> MyStream<T> of(List<T> aList) {
		return new MyStream<>(aList);
	}
	private MyStream(List<T> aList) {
		elements = new ArrayList<T>(aList);
	}
	
	public static <S> MyStream<S> concat(MyStream<S> s1, MyStream<S> s2) {
		s1.asList().addAll(s2.asList());
		return new MyStream<S>(s1.asList());
	}
	
	public <R> MyStream<R> flatMap(Function<T, MyStream<R>> mapper) {
		MyStream<MyStream<R>> tempStream = new MyStream<MyStream<R>>(asList().stream()
																	   .map(mapper)
																	   .collect(Collectors.toList()));
		
		int size = tempStream.asList().size();
		
		MyStream<R> retVal = new MyStream<R>(tempStream.asList().get(0).asList());
		if (size > 1){
			tempStream.asList()
			  		  .subList(1, size)
			  		  .forEach(s -> MyStream.concat(retVal, s));
		}
		
		return retVal;
	}
	
	public List<T> asList() {
		return elements;
	}
	
	public <R> MyStream<R> map(Function<T,R> mapper) {
		return new MyStream<R>(asList().stream()
									   .map(mapper)
									   .collect(Collectors.toList()));
	}
	
	public MyStream<T> filter(Predicate<T> predicate) {
		return new MyStream<T>(asList().stream()
									   .filter(predicate)
									   .collect(Collectors.toList()));
	}
}
