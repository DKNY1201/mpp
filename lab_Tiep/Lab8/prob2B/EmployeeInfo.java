package prob2B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {
		BYNAME, BYSALARY
	};

	public void sort(List<Employee> emps) {
		class EmployeeComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				if (e1.name.equals(e2.name))
					return e1.salary - e2.salary;
				return e1.name.compareTo(e2.name);
			}
		}
		Collections.sort(emps, new EmployeeComparator());
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Joe", 50000));
		emps.add(new Employee("Andy", 60000));
		
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps);
		System.out.println(emps);
	}
}
