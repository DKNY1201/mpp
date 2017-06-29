package prob3tiep.inheritance;

public class Circle {
	private double radius;
	private String color;
	
	public Circle(){
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double radius){
		this.radius = radius;
		color = "red";
	}

	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}

	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return "Area of circle = " + getArea();
	}
	
}
