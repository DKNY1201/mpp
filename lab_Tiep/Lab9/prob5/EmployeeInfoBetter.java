package prob5;

import java.util.*;
import java.util.function.*;

public class EmployeeInfoBetter {
	static enum SortMethod {BYNAME, BYSALARY};
	
	Function<Employee, String> byName = e -> e.getName();
	Function<Employee, Integer> bySalary = e -> -e.getSalary();
	HashMap<Pair, Comparator<Employee>> map = new HashMap<>();
	
	public EmployeeInfoBetter() {
		map.put(new Pair(SortMethod.BYNAME), Comparator.comparing(byName).thenComparing(bySalary));
		map.put(new Pair(SortMethod.BYSALARY), Comparator.comparing(bySalary).thenComparing(byName));
	}
	
	public void sort(List<Employee> emps, final SortMethod sortMethod){
		Collections.sort(emps,map.get(new Pair(sortMethod)));
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Rick", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 10000));
		EmployeeInfoBetter ei = new EmployeeInfoBetter();
		ei.sort(emps, SortMethod.BYNAME);
		System.out.println(emps);
		ei.sort(emps, SortMethod.BYSALARY);
		System.out.println(emps);
	}
	
	class Pair{
		SortMethod key;
		Pair(SortMethod key){
			this.key = key;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj == null) return false;
			if (obj.getClass() != getClass()) return false;
			Pair p = (Pair)obj;
			return p.key.equals(key);
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(key);
		}
	}
}
