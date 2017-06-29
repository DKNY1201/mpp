package lesson2.lecture.bidir.onetoone_factory.extpackage;

import lesson2.lecture.birdir.onetoone_factory.CustShopCartFactory;
import lesson2.lecture.birdir.onetoone_factory.Customer;
import lesson2.lecture.birdir.onetoone_factory.Item;
import lesson2.lecture.birdir.onetoone_factory.ShoppingCart;

public class Main {

	public static void main(String[] args) {
		
		//Create new customer
		Customer cust = CustShopCartFactory.createCustomer("Bob");
		cust.getCart().addItem(new Item("Shirt"));
		
		//not possible to create instance of ShoppingCart outside of a Customer
		//--this is what is meant by "Customer owns the relationship"
		//  new ShoppingCart(...) -- compiler error
		
		System.out.println(cust.getCart().getItems());
		
		//Create new shopping cart for Bob
		ShoppingCart cart = CustShopCartFactory.createShoppingCart(cust);
		cart.addItem(new Item("Pants"));
		System.out.println(cust.getCart().getItems());
		
		//Cannot create Customer or ShoppingCart directly from Main
		//Customer c = new Customer("Bob") //compiler error
		//ShoppingCart s = new ShoppingCart();  //compiler error
		

	}

}
