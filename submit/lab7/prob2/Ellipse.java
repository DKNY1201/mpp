package lab7.prob2;

/**
 * Created by Bi on 7/10/17.
 */
public class Ellipse implements ClosedCurve {
    private final double a;
    private final double E;

    public Ellipse(double a, double E) {
        this.a = a;
        this.E = E;
    }


    @Override
    public double computePerimeter() {
        return 4 * a * E;
    }
}
