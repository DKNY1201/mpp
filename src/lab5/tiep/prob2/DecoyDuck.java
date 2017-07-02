package prob2;

public class DecoyDuck extends Duck{
	private CannotFly cf;
	private MuteQuack mute;

	public DecoyDuck() {
		cf = new CannotFly();
		mute = new MuteQuack();
	}
	
	@Override
	public void fly() {
		cf.fly();
	}
	@Override
	public void quack() {
		mute.quack();
	}

	@Override
	public void swim() {
		System.out.println("swimming");
	}

	@Override
	public void display() {
		System.out.println("display");
	}
}
