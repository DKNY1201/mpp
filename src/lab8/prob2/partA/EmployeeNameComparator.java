package lab8.prob2.partA;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
	    String name1 = e1.name;
	    String name2 = e2.name;
	    int salary1 = e1.salary;
        int salary2 = e2.salary;
		if (!name1.equals(name2)) {
			return name1.compareTo(name2);
		}
		return salary1 - salary2;
	}
}
