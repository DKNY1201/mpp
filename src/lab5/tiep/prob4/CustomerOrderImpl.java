package prob4;

import java.util.List;

public class CustomerOrderImpl implements CustomerAndOrder{
	private Customer customer;
	private List<Order> orders;
	
	CustomerOrderImpl(Customer customer, List<Order> orders){
		this.customer = customer;
		this.orders = orders;
	}
	
	@Override
	public Customer getCustomer() {
		return customer;
	}

	@Override
	public List<Order> getListOrder() {
		return orders;
	}

}
