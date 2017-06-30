package probc;

public abstract class Employee {
	public String empId;
	
	public Paycheck calcCompensation(int month, int year){
		double grossPay = calcGrossPay(month,year);
		double fica = grossPay * 0.23;
		double state = grossPay * 0.05;
		double local = grossPay * 0.01;
		double medicare = grossPay * 0.03;
		double socialSecurity = grossPay * 0.075;
		Paycheck paycheck = new Paycheck(grossPay, fica, state, local, medicare, socialSecurity);
		return paycheck;
	}
	
	public void print(int month, int year){
		Paycheck paycheck = calcCompensation(month, year);
		System.out.println("Compensation of Employee has Id = " + empId + " on " + month + "/" + year + ":");
		paycheck.print();
	}
	
	abstract double calcGrossPay(int month, int year);
}
