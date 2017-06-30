package probc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = getAllEmployeeFromDB();
		printAllPaycheckOfThisMonth(employees);
	}

	public static void printAllPaycheckOfThisMonth(List<Employee> employees) {
		for (Employee employee : employees) {
			employee.print();
		}
	}

	public static List<Employee> getAllEmployeeFromDB()
	{
		Hourly[] hourlies = new Hourly[] { new Hourly("001", 10, 40), new Hourly("002", 10, 20) };
		Salaried[] salarieds = new Salaried[] { new Salaried("003", 8000), new Salaried("004", 10000) };
		Commissioned com1 = new Commissioned("005", 0.03, 2000);
		com1.addOrder("order001", LocalDate.of(2017, 5, 15), 100000, com1);
		com1.addOrder("order002", LocalDate.of(2017, 5, 30), 200000, com1);
		Commissioned com2 = new Commissioned("006", 0.02, 3000);
		com2.addOrder("order003", LocalDate.of(2017, 6, 15), 300000, com2);
		com2.addOrder("order004", LocalDate.of(2017, 5, 15), 500000, com2);
		Commissioned com3 = new Commissioned("007", 0.01, 4000);
		Commissioned[] commissioneds = new Commissioned[] { com1, com2, com3 };

		List<Employee> employees = new ArrayList<Employee>();
		employees.addAll(Arrays.asList(hourlies));
		employees.addAll(Arrays.asList(salarieds));
		employees.addAll(Arrays.asList(commissioneds));
		
		return employees;
	}
}
