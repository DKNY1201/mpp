package lesson2.lecture.unidirectional.oneone;

public class Customer_Alt {
	private String name;
	private ShoppingCart_Alt cart;
	public Customer_Alt(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCart(ShoppingCart_Alt cart) {
		this.cart = cart;
	}
	public ShoppingCart_Alt getCart() {
		return cart;
	}
}
