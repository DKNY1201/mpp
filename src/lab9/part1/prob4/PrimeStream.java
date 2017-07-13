package lab9.part1.prob4;

import java.math.BigInteger;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Bi on 7/13/17.
 */
public class PrimeStream {
    Predicate<BigInteger> isPrimePre = n -> isPrime(n);

    boolean isPrime(BigInteger m) {
        int n = m.intValue();
        if (n < 3) {
            return false;
        }

        for (int i = 3; i < Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    final Stream<BigInteger> primes = Stream
            .iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE))
            .filter(isPrimePre);

    public void printFirstNPrimes(int n) {
        System.out.println(new PrimeStream().primes.limit(n).collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream();
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }
}
