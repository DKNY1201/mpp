package prob2;

public interface Polygon extends ClosedCurve{
	default double[] getSides(){
		return null;
	}
	
	@Override
	default double computePerimeter(){
		double sum = 0;
		for (double side : getSides()) {
			sum += side;
		}
		return sum;
	}
}
