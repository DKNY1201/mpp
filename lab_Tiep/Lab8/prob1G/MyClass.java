package prob1G;

import java.util.function.Function;

public class MyClass {
	public boolean myMethod(MyClass cl){
		Function<MyClass, Boolean> lamda = this::equals;
		return lamda.apply(cl);
	}
	
	public static void main(String[] args) {
		MyClass myclass1 = new MyClass();
		MyClass myclass2 = new MyClass();
		System.out.println(myclass1.myMethod(myclass1));
		System.out.println(myclass1.myMethod(myclass2));
	}
}

