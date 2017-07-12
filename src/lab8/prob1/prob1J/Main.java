package lab8.prob1.prob1J;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		//Prob1-J-ii
		Supplier<Double> supp = () -> Math.random();
		System.out.println(supp.get());
		
		//Prob1-J-iii
		RandomNum ran = new RandomNum();
		System.out.println(ran.get());
	}
	
	static class RandomNum implements Supplier<Double>{
		@Override
		public Double get() {
			return Math.random();
		}
	}

}
