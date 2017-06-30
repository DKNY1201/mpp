package probc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders;

	public Commissioned(String empId, double commission, double baseSalary) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		orders = new ArrayList<Order>();
	}
	
	public double getBaseSalary(){
		return baseSalary;
	}

	public double getCommission(){
		return commission;
	}
	
	public void addOrder(String orderNo, LocalDate orderDate, double orderAmount, Commissioned commissioned) {
		orders.add(new Order(orderNo, orderDate, orderAmount, commissioned));
	}

	@Override
	double calcGrossPay(int month, int year) {
		return getBaseSalary() + calcCommissionAmount(month,year,getCommission());
	}

	public double calcCommissionAmount(int month, int year, double commission){
		double commissionAmount = 0;
		for (Order order : orders) {
			int orderMonth = order.getOrderDate().getMonthValue();
			int orderYear = order.getOrderDate().getYear();
			if (month > 1){
				if (orderYear == year && orderMonth == month - 1)
					commissionAmount += order.getOrderAmount() * commission;
			}else{
				if (orderYear == year - 1 && orderMonth == 12)
					commissionAmount += order.getOrderAmount() * commission;
			}
		}
		return commissionAmount;
	}
}
