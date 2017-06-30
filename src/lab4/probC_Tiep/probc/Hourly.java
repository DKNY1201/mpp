package probc;

public class Hourly extends Employee {
	private double hourlyWage;
	private double hoursPerWeek;

	public Hourly(String empId, double hourlyWage, double hoursPerWeek) {
		this.empId = empId;
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	double calcGrossPay(int month, int year) {
		return getHourlyWage() * getHoursPerWeek() * 4;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public double getHoursPerWeek() {
		return hoursPerWeek;
	}

}
