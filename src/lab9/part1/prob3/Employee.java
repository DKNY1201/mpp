package lab9.part1.prob3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	int salary;
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}

	@Override
	public String toString() {
		return getName() + " " + getSalary();
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("Andy", 10000);
		Employee emp2 = new Employee("Bob", 20000);
		Employee emp3 = new Employee("Jacky", 30000);
		Employee emp4 = new Employee("Benny", 30000);
		Employee emp5 = new Employee("Duck", 50000);
		Employee emp6 = new Employee("Andy", 60000);
		Employee emp7 = new Employee("Bob", 70000);
		Employee emp8 = new Employee("Andy", 10000);

		List<Employee> employees = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8);

		Function<Employee, String> byName = employee -> employee.getName();
		Function<Employee, Integer> bySalary = employee -> employee.getSalary();

		Comparator<Integer> comparator = (x, y) -> x - y;

		List<Employee> sortedEmployeeByName = employees.stream()
				.sorted(Comparator.comparing(byName).thenComparing(bySalary, comparator::compare))
				.collect(Collectors.toList());

		System.out.println(sortedEmployeeByName);
	}
}

