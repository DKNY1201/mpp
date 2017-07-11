package prob2;

public interface Polygon extends ClosedCurve{
	public double[] getSides();
	
	@Override
	default double computePerimeter(){
		double sum = 0;
		for (double side : getSides()) {
			sum += side;
		}
		return sum;
	}
}
