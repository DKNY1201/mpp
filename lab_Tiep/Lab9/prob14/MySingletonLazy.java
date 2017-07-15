package prob14;

import java.util.Optional;

public class MySingletonLazy {
	private static MySingletonLazy instance = null;
	
	private MySingletonLazy() {}
	
//	public static MySingletonLazy getInstance() {
//		if (instance == null)
//			instance = new MySingletonLazy();
//		System.out.println(instance);
//		return instance;
//	}
	
	public static MySingletonLazy getInstance() {
		Optional<MySingletonLazy> optionlInstance = Optional.ofNullable(instance);
		instance = optionlInstance.orElse(new MySingletonLazy());
		
		return instance;
	}
	
	public static void main(String[] args) {
		MySingletonLazy.getInstance();
		System.out.println(MySingletonLazy.instance);
		MySingletonLazy.getInstance();
		System.out.println(MySingletonLazy.instance);
		MySingletonLazy.getInstance();
		System.out.println(MySingletonLazy.instance);
	}

}
