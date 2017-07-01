package prob2;

public class RedheadDuck extends Duck{
	private FlyWithWings fw;
	private Quack quack;

	public RedheadDuck() {
		fw = new FlyWithWings();
		quack = new Quack();
	}
	@Override
	void fly() {
		fw.fly();
	}
	@Override
	void quack() {
		quack.quack();
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