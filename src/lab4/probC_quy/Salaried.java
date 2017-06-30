package lab4.probC_quy;

/**
 * Created by Bi on 6/29/17.
 */
public class Salaried extends Employee {
    double salary;
    
    Salaried(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }
    
    public double getSalary() {
    	return this.salary;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return salary;
    }
}
