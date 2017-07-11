package prob2;

public class EquilateralTriangle implements ClosedCurve {
	private double side;

	public EquilateralTriangle(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double[] getSides() {
		return new double[] { side, side, side };
	}
}
