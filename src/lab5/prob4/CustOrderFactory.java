package lab5.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bi on 7/2/17.
 */
public class CustOrderFactory {
    private CustOrderFactory() {}

    public static CustomerAndOrder createCustomerAndOrder(String customerName) {
        Customer customer = new Customer(customerName);
        List<Order> orders = new ArrayList<>();
        customer.setOrders(orders);
        return new CustomerAndOrder(customer, orders);
    }

    public static Order newOrder(CustomerAndOrder customerAndOrder, LocalDate date) {
        Order order = Order.newOrder(customerAndOrder.getCustomer(), date);
        return order;
    }
}
