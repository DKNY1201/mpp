package prob2A;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		//rewrite compare
		if (e1.name.equals(e2.name))
			return e1.salary - e2.salary;
		return e1.name.compareTo(e2.name);
	}
}
