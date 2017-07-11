package prob2;

public interface ClosedCurve extends Polygon{
@Override
default double computePerimeter() {
	// TODO Auto-generated method stub
	return Polygon.super.computePerimeter();
}
}
