package prob3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("serial")
		List<Shape> shapes = new ArrayList<Shape>(){
			{
				add(new Triangle(1, 2));
				add(new Rectangle(2, 4));
				add(new Circle(1));
			}
		};
		
		double sumOfArea = 0;
		for (Shape shape : shapes) {
			double area = shape.computeArea();
			sumOfArea += area;
			System.out.println(area);
		}
		System.out.println("Sum of Areas = " + sumOfArea);
	}
}
