package lab7.prob2_quy;

/**
 * Created by Bi on 7/10/17.
 */
public class EquilateralTriangle implements ClosedCurve, Polygon {
    private final double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double[] getSides() {
        return new double[] {side, side, side};
    }

    @Override
    public double computePerimeter() {
        return side + side + side;
    }
}
