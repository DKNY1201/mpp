package lab8.prob2.partA;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		String name1 = e1.name;
		String name2 = e2.name;
		int salary1 = e1.salary;
		int salary2 = e2.salary;

		if (salary1 != salary2) {
			return salary1 - salary2;
		}

		return name1.compareTo(name2);

	}
}
