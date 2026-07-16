package com.corejavaproject.basics.oops.aggregation;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Payment {
    boolean available;
    String orderName;
    double price;

    public Payment(boolean available, String orderName, double price) {
        this.available = available;
        this.orderName = orderName;
        this.price = price;
    }
    public void getPayment() {
        log.info("Order Name : " + this.orderName);
        log.info("Stock Available : " + this.available);
        log.info("Price : " + this.price);

    }
}
