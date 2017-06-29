package lab2.prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private LocalDate orderDate;
	boolean isPrepaid;
	private List<OrderLine> orderLines;
	
	public Order(LocalDate orderDate){
		this.orderDate = orderDate;
		orderLines = new ArrayList<OrderLine>();
	}
	
	public void addOrderLine(String item, double cost, int quantity){
		orderLines.add(new OrderLine(item,cost,quantity));
	}
	
	@Override
	public String toString() {
		return orderDate + ": " + orderLines.toString();
	}
}
