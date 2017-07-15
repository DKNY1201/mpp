package lab9.part1.prob5;

import java.util.*;
import java.util.function.Function;

public class EmployeeInfoBetter {
	Function<Employee, String> byName = e -> e.getName();
	Function<Employee, Integer> bySalary = e -> -e.getSalary();
	HashMap<Pair, Comparator> hashMap = new HashMap<>();

	{
		hashMap.put(new Pair(SortMethod.BYNAME), Comparator.comparing(byName).thenComparing(bySalary));
		hashMap.put(new Pair(SortMethod.BYSALARY), Comparator.comparing(bySalary).thenComparing(byName));
	}

	public void sort(List<Employee> emps, final SortMethod method) {
		if(method == SortMethod.BYNAME) {
			Collections.sort(emps, Comparator.comparing(byName).thenComparing(bySalary));
		} else {
			Collections.sort(emps, Comparator.comparing(bySalary).thenComparing(byName));
		}
	}

	public void sort1(List<Employee> emps, final SortMethod method) {
		Pair pair = new Pair(method);
		Collections.sort(emps, hashMap.get(pair));
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Rick", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 10000));
		EmployeeInfoBetter ei = new EmployeeInfoBetter();
		ei.sort1(emps, SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort1(emps, SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
