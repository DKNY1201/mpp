package prob3;

/**
 * Created by Bi on 6/28/17.
 */
public class Cyderlin_Composition {
    double height;
    Circle circle;

    Cyderlin_Composition() {
        this(1);
    }

    Cyderlin_Composition(double radius) {
        this.circle = new Circle(radius);
        this.height = 1;
    }

    Cyderlin_Composition(double radius, double height) {
        this.circle = new Circle(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return getHeight() * this.circle.getArea();
    }
    
    @Override
	public String toString() {
		return "Volume of cylinder = " + getVolume();
	}

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle);

        Cyderlin_Composition cylinder = new Cyderlin_Composition(3, 10);
        System.out.println(cylinder);
    }
}
