package lab2.prob2B;

public class OrderLine {
	private String item;
	private double cost;
	private int quantity;
	
	public OrderLine(String item, double cost, int quantity){
		this.item = item;
		this.cost = cost;
		this.quantity = quantity;
	}
	
	@Override
	public String toString(){
		return "[" + item + ", $" + cost + ", " + quantity+"]";
	}
}
