package prob3;

public final class Circle implements Shape {
	private final double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	public double computeArea(){
		return radius * radius * Math.PI;
	}

	public double getRadius() {
		return radius;
	}
}
