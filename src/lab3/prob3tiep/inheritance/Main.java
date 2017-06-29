package prob3tiep.inheritance;

public class Main {
	public static void main(String[] args) {
		Cylinder cy1 = new Cylinder();
		Cylinder cy2 = new Cylinder(2);
		Cylinder cy3 = new Cylinder(2,10);
		
		System.out.println(cy1);
		System.out.println(cy2);
		System.out.println(cy3);
	}
}
