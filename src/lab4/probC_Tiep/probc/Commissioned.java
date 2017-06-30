package probc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders;

	public Commissioned(String empId, double commission, double baseSalary) {
		this.empId = empId;
		this.commission = commission;
		this.baseSalary = baseSalary;
		orders = new ArrayList<Order>();
	}

	public void addOrder(String orderNo, LocalDate orderDate, double orderAmount, Commissioned commissioned) {
		orders.add(new Order(orderNo, orderDate, orderAmount, commissioned));
	}
	
	@Override
	public Paycheck calcCompensation(LocalDate month) {
		double commissionAmount = 0;
		int monthValue = month.getMonthValue();
		int yearValue = month.getYear();
		for (Order order : orders) {
			int orderMonth = order.getOrderDate().getMonthValue();
			int orderYear = order.getOrderDate().getYear();
			if (monthValue > 1){
				if (orderYear == yearValue && orderMonth == monthValue - 1)
					commissionAmount += order.getOrderAmount() * commission;
			}else{
				if (orderYear == yearValue - 1 && orderMonth == 12)
					commissionAmount += order.getOrderAmount() * commission;
			}
		}
		
		double grossPay = calcGrossPay() + commissionAmount;
		double fica = grossPay * 0.23;
		double state = grossPay * 0.05;
		double local = grossPay * 0.01;
		double medicare = grossPay * 0.03;
		double socialSecurity = grossPay * 0.075;
		Paycheck paycheck = new Paycheck(grossPay, fica, state, local, medicare, socialSecurity);
		
		return paycheck;
	}

	@Override
	double calcGrossPay() {
		return baseSalary;
	}

}
