package prob4;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeStream {
	Predicate<Integer> primeFilter = this::isPrime;
	final Stream<Integer> primes = Stream.iterate(2, x -> x + 1).filter(primeFilter);

	boolean isPrime(Integer num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
	
	void printFirstNPrimes(long n){
		System.out.println(new PrimeStream().primes.limit(n).collect(Collectors.toList()));
	}

	public static void main(String[] args) {
		PrimeStream ps = new PrimeStream();
		
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);
	}
}
