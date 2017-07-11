package lab7.prob2;

/**
 * Created by Bi on 7/10/17.
 */
public interface Polygon {
    public double[] getSides();
    public default double computePerimeter() {
        double perimeter = 0;
        for (double side: getSides()) {
            perimeter += side;
        }
        return perimeter;
    }
}
