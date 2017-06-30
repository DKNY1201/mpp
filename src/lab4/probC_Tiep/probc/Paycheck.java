package probc;

public class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;

	Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}

	public void print() {
		System.out.println("Net Pay: " + getNetPay());
	}

	public double getNetPay() {
		return grossPay - fica - state - local - medicare - socialSecurity;
	}
}
