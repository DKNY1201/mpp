package probc;

import java.time.LocalDate;

public class Order {
	private String orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	private Commissioned commissioned;
	
	Order(String orderNo, LocalDate orderDate, double orderAmount, Commissioned commissioned){
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.commissioned = commissioned;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public Commissioned getCommissioned() {
		return commissioned;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public String getOrderNo() {
		return orderNo;
	}
	
}
