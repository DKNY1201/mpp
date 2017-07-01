package prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

final public class CustOrderFactory {
	private CustOrderFactory(){};
	
	public static CustomerAndOrder createCustomerOrder(String name) {
		Customer customer = new Customer(name);
		List<Order> orders = new ArrayList<Order>();
		return new CustomerOrderImpl(customer, orders);
	}
	
	public static void addOrderItem(Customer customer, LocalDate orderDate,String[] items){		
		Order order = new Order(orderDate);
		for (String itemName : items) {
			order.addItem(itemName);
		}
		
		customer.addOrder(order);
	}
}
