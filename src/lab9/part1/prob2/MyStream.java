package lab9.part1.prob2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream<T> {
	private List<T> elements;
	public static <T> MyStream<T> of(List<T> aList) {
		return new MyStream<T>(aList);
	}
	private MyStream(List<T> aList) {
		elements = aList;
	}
	
	public static <S> MyStream<S> concat(MyStream<S> s1, MyStream<S> s2) {
		s1.asList().addAll(s2.asList());
		return new MyStream<S>(s1.asList());
	}
	
	public <R> MyStream<R> flatMap(Function<T, MyStream<R>> mapper) {
		// List of R for new MyStream<R>
		List<R> listR = new ArrayList<>();

		// List of MyStream<R> for receive data from current 'elements'
		List<MyStream<R>> newStreamList = new ArrayList<>();

		// The mapper need 1 input as type T and return a MyStream as type R
		// So we need give T (each element in 'elements')
		elements.forEach(
				e -> newStreamList.add(mapper.apply(e))
		);

		// Put all 'elements' from list of MyStream<R> in to a List of R
		newStreamList.forEach(streamR -> listR.addAll(streamR.asList()));
		return new MyStream<R>(listR);
	}
	
	public List<T> asList() {
		return elements;
	}
	
	public <R> MyStream<R> map(Function<T,R> mapper) {
		return new MyStream<R>(
				asList().stream()
					.map(mapper)
					.collect(Collectors.toList())
		);
	}
	
	public MyStream<T> filter(Predicate<T> predicate) {
		return new MyStream<T>(asList().stream()
				.filter(predicate)
				.collect(Collectors.toList()));
	}
}
