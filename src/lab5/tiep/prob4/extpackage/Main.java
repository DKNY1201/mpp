package prob4.extpackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import prob4.*;

public class Main {
	public static void main(String[] args) {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		CustomerAndOrder custOrder1 = CustOrderFactory.createCustomerOrder("Tiep");
		CustomerAndOrder custOrder2 = CustOrderFactory.createCustomerOrder("Quy");
		
		CustOrderFactory.addOrderItem(custOrder1.getCustomer(), LocalDate.of(2017, 6, 30), new String[]{"Apple","Lemon","Pine Apple"});
		CustOrderFactory.addOrderItem(custOrder1.getCustomer(), LocalDate.of(2017, 7, 1), new String[]{"iPhone 7","iPad Pro", "Macbook Pro"});
		
		CustOrderFactory.addOrderItem(custOrder2.getCustomer(), LocalDate.of(2017, 7, 1), new String[]{"Banana","Cherry"});
		CustOrderFactory.addOrderItem(custOrder2.getCustomer(), LocalDate.of(2017, 7, 1), new String[]{"Samsung Galaxy S8", "Samsung Galaxy Tab"});
		
		customers.add(custOrder1.getCustomer());
		customers.add(custOrder2.getCustomer());
		
		for (Customer customer : customers) {
			System.out.println("Customer " + customer.getName() + " ordered:");
			for (Order order : customer.getOrders()) {
				System.out.println("Order Date: " + order);
			}
			System.out.println();
		}
	}
}
