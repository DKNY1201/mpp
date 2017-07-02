package lab5.prob4.extpackage;

import java.time.LocalDate;

import lab5.prob4.*;

public class Main {
	public static void main(String[] args) {
		CustomerAndOrder customerAndOrder1 = CustOrderFactory.createCustomerAndOrder("Quy");

		Order order1 = CustOrderFactory.newOrder(customerAndOrder1, LocalDate.of(2017, 06, 30));
		order1.addItem("Shirt");
		order1.addItem("Laptop");

		Order order2 = CustOrderFactory.newOrder(customerAndOrder1, LocalDate.of(2017, 07, 02));
		order2.addItem("Pants");
		order2.addItem("Knife set");


		CustomerAndOrder customerAndOrder2 = CustOrderFactory.createCustomerAndOrder("Tiep");

		Order order3 = CustOrderFactory.newOrder(customerAndOrder2, LocalDate.of(2017, 06, 25));
		order3.addItem("Toys");
		order3.addItem("Ice Cream");

		Order order4 = CustOrderFactory.newOrder(customerAndOrder2, LocalDate.of(2017, 07, 01));
		order4.addItem("Shoes");
		order4.addItem("Meat");


		System.out.println("Customer " + customerAndOrder1.getCustomer().getName() + " have order(s) "
				+ customerAndOrder1.getCustomer().getOrders());
		System.out.println("Customer " + customerAndOrder2.getCustomer().getName() + " have order(s) "
				+ customerAndOrder2.getCustomer().getOrders());
	}
}

		
