package prob2;

public interface Polygon {
	default double[] getSides(){
		return null;
	}
	
	default double computePerimeter(){
		double sum = 0;
		for (double side : getSides()) {
			sum += side;
		}
		return sum;
	}
}
