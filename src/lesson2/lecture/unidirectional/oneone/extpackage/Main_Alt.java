package lesson2.lecture.unidirectional.oneone.extpackage;

import lesson2.lecture.unidirectional.oneone.*;

public class Main_Alt {
	public static void main(String[] args) {
		Customer_Alt cust = new Customer_Alt("Bob");
		ShoppingCart_Alt cart = ShoppingCart_Alt.newShoppingCart(cust);
		cart.addItem(new Item("Shirt"));
		System.out.println(
			cust.getCart().getItems());
		
		
	}
	
}

		
