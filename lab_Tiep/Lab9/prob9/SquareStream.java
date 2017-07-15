package prob9;

import java.util.stream.IntStream;

public class SquareStream {
	public static void printSquares(int num){
		IntStream squares = IntStream.iterate(1, x -> x + 1).filter(x -> Math.sqrt(x) == Math.ceil(Math.sqrt(x)));
		squares.limit(num).forEach(x -> System.out.print(x + " "));
	}
	
	public static void main(String[] args) {
		SquareStream.printSquares(10);
		System.out.println("\n------------------------------------------");
		SquareStream.printSquares(5);
	}
}
