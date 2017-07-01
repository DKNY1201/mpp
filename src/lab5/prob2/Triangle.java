package lab5.prob2;

/**
 * Created by Bi on 7/1/17.
 */
final public class Triangle implements Shape {
    private final double base;
    private final double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double computeArea() {
        return (base + height) / 2;
    }
}
