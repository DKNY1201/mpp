package prob2;

public class MallardDuck extends Duck{
	private FlyWithWings fw;
	private Quack quack;

	public MallardDuck() {
		fw = new FlyWithWings();
		quack = new Quack();
	}
	@Override
	public void fly() {
		fw.fly();
	}
	@Override
	public void quack() {
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
