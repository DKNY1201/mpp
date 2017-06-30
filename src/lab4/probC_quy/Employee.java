package lab4.probC_quy;

/**
 * Created by Bi on 6/29/17.
 */
abstract public class Employee {
    String empId;

    Employee(String empId) {
        this.empId = empId;
    }

    public String getEmpId() {
        return this.empId;
    }

    public void print(int month, int year) {
        System.out.println("Compensation for " + getEmpId() + " in " + month + "/" + year + " is " + calcCompensation(month, year).print());
    }

    public Paycheck calcCompensation(int month, int year) {
        double grossPay = calcGrossPay(month, year);
        return new Paycheck(grossPay);
    }

    abstract public double calcGrossPay(int month, int year);

}
