package lesson2.lecture.unidirectional.oneone;

import java.util.*;

public class ShoppingCart_Alt {
	private List<Item> items;

	public void addItem(Item item) {
		items.add(item);
	}

	/** Use a factory method for construction */
	private ShoppingCart_Alt(Customer_Alt cust) {
		items = new ArrayList<Item>();
		cust.setCart(this);
	}

	public static ShoppingCart_Alt newShoppingCart(Customer_Alt cust) {
		if (cust == null)
			throw new NullPointerException("Null customer");
		
		return new ShoppingCart_Alt(cust);
	}

	public List<Item> getItems() {
		return items;
	}
}
