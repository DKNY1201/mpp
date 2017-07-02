package lab5.prob3;

/**
 * Created by Bi on 7/1/17.
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(3), new Rectangle(2, 3), new Triangle(1,2),
                new Circle(4), new Rectangle(2, 4), new Triangle(1,3)};

        double sumArea = 0;
        for (Shape shape: shapes) {
            sumArea += shape.computeArea();
        }

        System.out.println("Sum of Areas = " + sumArea);
    }
}
