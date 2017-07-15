package prob11b;

import java.util.*;
import java.util.stream.Collectors;

import prob11a.Employee;


public class Main {																	  

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		System.out.println(LambdaLibrary.EMPLOYEE_WITH_LASTNAMEINIT_SALARY.apply(list, Character.valueOf('M'), Double.valueOf(100000)));
	}

	static class LambdaLibrary{
		public static final TriFunction<List<Employee>, Character, Double, 
		String> EMPLOYEE_WITH_LASTNAMEINIT_SALARY = (list, c, s) -> 
			list.stream()																  
				.filter(e -> e.getLastName().charAt(0) > c)
				.filter(e -> e.getSalary() > s)												  
				.sorted(Comparator.comparing(Employee::getFirstName)									 						 		   		    
								  .thenComparing(Employee::getLastName))
				.map(e -> e.getFirstName() + " " + e.getLastName())
				.collect(Collectors.joining(", "));
	}
}
