package prob2C;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	public void sort(List<Employee> emps) {
		Collections.sort(emps, (e1,e2) ->
		{
			if (e1.name.equals(e2.name))
				return e1.salary - e2.salary;
			return e1.name.compareTo(e2.name);
		});
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
