package lab5.prob2;

/**
 * Created by Bi on 7/1/17.
 */
final public class Circle implements Shape{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double computeArea() {
        return radius * radius * Math.PI;
    }
}
