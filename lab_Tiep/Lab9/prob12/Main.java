package prob12;

import java.util.*;
import java.util.stream.Collectors;

import prob11a.Employee;
import prob11b.TriFunction;

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
		
		//print the number of Employees in list whose salary > 100000 and whose last name begins
		//with a letter that comes after the letter 'E'
		System.out.println(LambdaLibrary.EMPLOYEE_WITH_LASTNAMEINIT_SALARY.apply(list, Character.valueOf('E'), Double.valueOf(100000)));
		
		//print a list of sorted full names - all upper case -- of Employees with
		//salary > 85000 and whose first name begins with a letter that comes before  the letter 'R'
		System.out.println(LambdaLibrary.EMPLOYEE_WITH_SORTED_FIRSTNAMEINIT_SALARY.apply(list, Character.valueOf('R'), Double.valueOf(85000)));
		System.out.println(LambdaLibrary.EMPLOYEE_WITH_SORTED_FIRSTNAMEINIT_SALARY.apply(list, Character.valueOf('J'), Double.valueOf(85000)));
	}

	static class LambdaLibrary{
		public static final TriFunction<List<Employee>, Character, Double, 
		String> EMPLOYEE_WITH_LASTNAMEINIT_SALARY = (list, c, s) -> 
			list.stream()																  
				.filter(e -> e.getLastName().charAt(0) > c)
				.filter(e -> e.getSalary() > s)							
				.map(e -> e.getFirstName() + " " + e.getLastName())
				.collect(Collectors.joining(", "));
		
		public static final TriFunction<List<Employee>, Character, Double, 
		String> EMPLOYEE_WITH_SORTED_FIRSTNAMEINIT_SALARY = (list, c, s) -> 
			list.stream()																  
				.filter(e -> e.getFirstName().charAt(0) == c)
				.filter(e -> e.getSalary() > s)												  
				.sorted(Comparator.comparing(Employee::getFirstName)									 						 		   		    
								  .thenComparing(Employee::getLastName))
				.map(e -> e.getFirstName().toUpperCase() + " " + e.getLastName().toUpperCase())
				.collect(Collectors.joining(", "));
	}
}
