package lab4.probC_quy;

/**
 * Created by Bi on 6/29/17.
 */
public class Hourly extends Employee {
    double hourlyWage;
    double hoursPerWeek;

    Hourly(String empId, double hourlyWage, double hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }
    
    public double getHourlyWage() {
		return this.hourlyWage;
	}

	public double getHoursPerWeek() {
		return this.hoursPerWeek;
	}

	@Override
    public double calcGrossPay(int month, int year) {
        return getHourlyWage() * getHoursPerWeek();
    }
}
