package prob3;

/**
 * Created by Bi on 6/28/17.
 */
public class Circle {
    double radius;
    String color;

    Circle() {
        this(1);
    }

    Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
	public String toString() {
		return "Area of circle = " + getArea();
	}
}
