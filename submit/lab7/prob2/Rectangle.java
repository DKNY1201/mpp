package lab7.prob2;

public class Rectangle implements ClosedCurve, Polygon {
	private double length, width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double[] getSides() {
		return new double[] {length, length, width, width};
	}

	@Override
	public double computePerimeter() {
		return length + length + width + width;
	}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
}
