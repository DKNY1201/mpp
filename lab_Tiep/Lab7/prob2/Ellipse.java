package prob2;

public class Ellipse implements ClosedCurve{
	private double semiMajorAxis;
	private double E;
	public Ellipse(double semiMajorAxis, double E) {
		this.semiMajorAxis = semiMajorAxis;
		this.E = E;
	}
	
	public double getMajorAxis() {
		return semiMajorAxis;
	}
	public void setMajorAxis(double radius) {
		this.semiMajorAxis = radius;
	}
	
	public double getE() {
		return E;
	}
	public void setE(double E) {
		this.E = E;
	}
	
	@Override
	public double computePerimeter() {
		return 4 * semiMajorAxis * E;
	}
}
