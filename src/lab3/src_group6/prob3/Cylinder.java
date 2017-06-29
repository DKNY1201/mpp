package prob3;

/**
 * Created by Bi on 6/28/17.
 */
public class Cylinder extends Circle {
    double height;

    Cylinder() {
        this(1);
    }

    Cylinder(double radius) {
        super(radius);
        this.height = 1;
    }

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return getHeight() * getArea();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(3, 10);
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getArea());
    }
}
