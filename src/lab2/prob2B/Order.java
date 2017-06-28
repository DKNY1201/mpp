package lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bi on 6/28/17.
 */
public class Order {
    String orderNum;
    List<OrderLine> orderLines = new ArrayList<OrderLine>();

    public Order(String orderNum) {
        this.orderNum = orderNum;
    }

    public void addOrderLine(String itemName) {
        Item item = new Item(itemName);
        OrderLine orderLine = new OrderLine(item, this);
        orderLines.add(orderLine);
    }
}
