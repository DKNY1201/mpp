package lab8.prob2.partC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	static enum SortMethod {BYNAME, BYSALARY};
	
	public void sort(List<Employee> emps, final SortMethod method) {
//		class EmployeeComparator implements Comparator<Employee> {
//			@Override
//			public int compare(Employee e1, Employee e2) {
//				String name1 = e1.name;
//				String name2 = e2.name;
//				int salary1 = e1.salary;
//				int salary2 = e2.salary;
//				if(method == SortMethod.BYNAME) {
//					if (!name1.equals(name2)) {
//						return name1.compareTo(name2);
//					}
//					return salary1 - salary2;
//				} else {
//					if (salary1 != salary2) {
//						return salary1 - salary2;
//					}
//					return name1.compareTo(name2);
//				}
//			}
//		}
//		Collections.sort(emps, new EmployeeComparator());
		Collections.sort(emps, (e1, e2) -> {
			String name1 = e1.name;
			String name2 = e2.name;
			int salary1 = e1.salary;
			int salary2 = e2.salary;
			if(method == SortMethod.BYNAME) {
				if (!name1.equals(name2)) {
					return name1.compareTo(name2);
				}
				return salary1 - salary2;
			} else {
				if (salary1 != salary2) {
					return salary1 - salary2;
				}
				return name1.compareTo(name2);
			}
		});
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
