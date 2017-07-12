package prob2A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {
		BYNAME, BYSALARY
	};

	SortMethod method;

	public EmployeeInfo(SortMethod method) {
		this.method = method;
	}

	public void sort(List<Employee> emps) {
		if (method == SortMethod.BYNAME) {
			Collections.sort(emps, new EmployeeNameComparator());
		} else if (method == SortMethod.BYSALARY) {
			Collections.sort(emps, new EmployeeSalaryComparator());
		}
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		
		// example of two Employee have the same name but not consider to equal
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Joe", 50000));
		emps.add(new Employee("Andy", 60000));
		
		//Example
//		Collections.sort(emps, new EmployeeNameComparator());
//		System.out.println(emps);
//
//		EmployeeInfo ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
//		ei.sort(emps);
//		System.out.println(emps);
//		
//		ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
//		ei.sort(emps);
//		System.out.println(emps);
		
		//NameComparator solution: rewrite compare method
		EmployeeInfo ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
		ei.sort(emps);
		System.out.println(emps);
		
		//sort by Collections
		Collections.sort(emps, new EmployeeNameComparator());
		System.out.println(emps);

		//Lamda Solution
		Comparator<Employee> compLamda = (e1, e2) -> {
			if (e1.name.equals(e2.name))
				return e1.salary - e2.salary;
			return e1.name.compareTo(e2.name);
		};
		Collections.sort(emps, compLamda);
		System.out.println(emps);
	}
}
