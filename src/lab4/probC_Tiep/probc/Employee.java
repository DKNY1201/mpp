package probc;

import java.time.LocalDate;

abstract class Employee {
	public String empId;
	
	public Paycheck calcCompensation(LocalDate month){
		double grossPay = calcGrossPay();
		double fica = grossPay * 0.23;
		double state = grossPay * 0.05;
		double local = grossPay * 0.01;
		double medicare = grossPay * 0.03;
		double socialSecurity = grossPay * 0.075;
		Paycheck paycheck = new Paycheck(grossPay, fica, state, local, medicare, socialSecurity);
		return paycheck;
	}
	
	public void print(){
		System.out.println("Compensation of Employee has Id = " + empId + " in this month:");
		
		//I think requirement of prob C is get compensation of an Employee in current month
		//If I'm wrong, the solution is add more parameter to method calcGrossPay to get compensation of an Employee in a specific month.
		calcCompensation(LocalDate.now()).print();
	}
	
	abstract double calcGrossPay();
}
