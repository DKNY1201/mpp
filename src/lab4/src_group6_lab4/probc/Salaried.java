package probc;

public class Salaried extends Employee{
	private double salary;
	
	public Salaried(String empId, double salary){
		super(empId);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	@Override
	double calcGrossPay(int month, int year) {
		return getSalary();
	}
}
