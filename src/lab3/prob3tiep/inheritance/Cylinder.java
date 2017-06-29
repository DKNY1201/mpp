package prob3tiep.inheritance;

public class Cylinder extends Circle{
	private double height;
	
	public Cylinder(){
		height = 1.0;
	}
	
	public Cylinder(double radius){
		super(radius);
		height = 1.0;
	}
	
	public Cylinder(double radius, double height){
		super(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public double getVolume(){
		return height*super.getArea();
	}
}
