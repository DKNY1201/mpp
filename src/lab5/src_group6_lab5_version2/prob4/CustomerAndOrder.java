package prob4;

import java.util.List;

/**
 * Created by Bi on 7/2/17.
 */
public class CustomerAndOrder {
    Customer customer;
    List<Order> orders;

    CustomerAndOrder(Customer customer, List<Order> orders) {
        this.customer = customer;
        this.orders = orders;
    }

    public Customer getCustomer() {
        return this.customer;
    }
}
