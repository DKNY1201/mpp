package prob3tiep.composition;

public class Cylinder{
	Circle circle;
	private double height;
	
	public Cylinder(){
		circle = new Circle();
		height = 1.0;
	}
	
	public Cylinder(double radius){
		circle = new Circle(radius);
		height = 1.0;
	}
	
	public Cylinder(double radius, double height){
		circle = new Circle(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume(){
		return height*circle.getArea();
	}
	
	@Override
	public String toString() {
		return "Volume of cylinder = " + getVolume();
	}
}
