package prob2;

public class DecoyDuck extends Duck{
	private CannotFly cf;
	private MuteQuack mute;

	public DecoyDuck() {
		cf = new CannotFly();
		mute = new MuteQuack();
	}
	@Override
	void fly() {
		cf.fly();
	}
	@Override
	void quack() {
		mute.quack();
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
