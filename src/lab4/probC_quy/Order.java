package lab4.probC_quy;

import java.util.Date;

/**
 * Created by Bi on 6/29/17.
 */
public class Order {
    String orderNo;
    Date orderDate;

    double orderAmount;

    public Order(String orderNo, Date orderDate, double orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}
