package prob2;

public class RubberDuck extends Duck{
	private CannotFly cf;
	private Squeak squeak;

	public RubberDuck() {
		cf = new CannotFly();
		squeak = new Squeak();
	}
	@Override
	void fly() {
		cf.fly();
	}
	@Override
	void quack() {
		squeak.quack();
	}

	@Override
	void swim() {
		System.out.println("swimming");
	}

	@Override
	void display() {
		System.out.println("display");
	}
}
