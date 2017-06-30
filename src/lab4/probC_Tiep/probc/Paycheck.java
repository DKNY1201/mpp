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
		System.out.println("-------------------------------------------------------");
		System.out.println("Gross Pay: " + grossPay);
		System.out.println("-------------------------------------------------------");
		System.out.println("Federal Income Tax: " + fica);
		System.out.println("State Income Tax: " + state);
		System.out.println("Local Tax: " + local);
		System.out.println("Medicare Tax: " + medicare);
		System.out.println("Social Security Tax: " + socialSecurity);
		System.out.println("-------------------------------------------------------");
		System.out.println("Net Pay: " + getNetPay() + "\n");
	}

	public double getNetPay() {
		return grossPay - fica - state - local - medicare - socialSecurity;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}
	
}
