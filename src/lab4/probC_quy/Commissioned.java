package lab4.probC_quy;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Bi on 6/29/17.
 */
public class Commissioned extends Employee {
    double commission;
    double baseSalary;
    List<Order> orderList;

    Commissioned(String empId, double commission, double baseSalary) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        orderList = new ArrayList<Order>();
    }

    public void addOrder(String orderNo, Date orderDate, double orderAmount) {
        orderList.add(new Order(orderNo, orderDate, orderAmount));
    }
    

    public double getCommission() {
		return commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	@Override
    public double calcGrossPay(int month, int year) {
        return getTotalOrderAmount(month, year) * getCommission() + getBaseSalary();
    }
	
	public double getTotalOrderAmount(int month, int year) {
		double totalOrderAmount = 0;

        for (Order order: getOrderList()) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(order.getOrderDate());
            int orderMonth = cal.get(Calendar.MONTH);
            int orderYear = cal.get(Calendar.YEAR);
            if (month == orderMonth && orderYear == year) {
                totalOrderAmount += order.getOrderAmount();
            }
        }
        
        return totalOrderAmount;
	}
}
