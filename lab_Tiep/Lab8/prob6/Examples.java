package prob6;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Examples {
	Function<Employee, String> a1 = (Employee e) -> e.getName();
	Function<Employee, String> a2 = Employee::getName;

	BiConsumer<Employee, String> b1 = (Employee e, String s) -> e.setName(s);
	BiConsumer<Employee, String> b2 = Employee::setName;

	BiFunction<String, String, Integer> c1 = (s1, s2) -> s1.compareTo(s2);
	BiFunction<String, String, Integer> c2 = String::compareTo;

	BiFunction<Integer, Integer, Double> d1 = (x, y) -> Math.pow(x, y);
	BiFunction<Integer, Integer, Double> d2 = Math::pow;

	Function<Apple, Double> e1 = (Apple a) -> a.getWeight();
	Function<Apple, Double> e2 = Apple::getWeight;

	Function<String, Integer> f1 = (String x) -> Integer.parseInt(x);
	Function<String, Integer> f2 = Integer::parseInt;

	EmployeeNameComparator comp = new EmployeeNameComparator();
	BiFunction<Employee, Employee, Integer> g1 = (Employee e1, Employee e2) -> comp.compare(e1, e2);
	BiFunction<Employee, Employee, Integer> g2 = comp::compare;

	void evaluator() {
		Employee emp1 = new Employee("Tiep", 100000);
		Employee emp2 = new Employee("Quy", 100001);
		System.out.println(a1.apply(emp1));
		System.out.println(a2.apply(emp2));
		
		b1.accept(emp1, "Peit");
		b2.accept(emp2, "Yuq");
		System.out.println(emp1);
		System.out.println(emp2);
		
		System.out.println(c1.apply("Tiep", "Quy"));
		System.out.println(c2.apply("Quy", "Tiep"));
		
		System.out.println(d1.apply(2, 2));
		System.out.println(d2.apply(2, 3));
		
		Apple apple = new Apple(2.5);
		System.out.println(e1.apply(apple));
		System.out.println(e2.apply(apple));
		
		System.out.println(f1.apply("1"));
		System.out.println(f1.apply("2"));
		
		System.out.println(g1.apply(emp1, emp2));
		System.out.println(g2.apply(emp2, emp1));
	}
	
	public static void main(String[] args) {
		Examples example = new Examples();
		example.evaluator();
	}
}
