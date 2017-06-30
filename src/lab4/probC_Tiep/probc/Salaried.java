package probc;

public class Salaried extends Employee{
	private double salary;
	
	public Salaried(String empId, double salary){
		this.empId = empId;
		this.salary = salary;
	}

	@Override
	double calcGrossPay(int month, int year) {
		return salary;
	}
}
