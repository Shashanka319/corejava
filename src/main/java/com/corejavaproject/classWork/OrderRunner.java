package com.corejavaproject.classWork;

import lombok.extern.log4j.Log4j2;

import java.util.*;

@Log4j2

public class OrderRunner {
    public static void main(String[] args) {
        Set<Order> set = new TreeSet<>(Comparator.comparing(Order::getId));
        Order order = new Order();
        order.setId(101);
        order.setProductName("Shampoo");
        order.setPrice(120.0);

        set.add(order);

        Order order1 = new Order();
        order1.setId(103);
        order1.setProductName("T-shirt");
        order1.setPrice(500.0);
        set.add(order1);
        set.add(order1);

        Order order2 = new Order();
        order2.setId(103);
        order2.setProductName("T-shirt");
        order2.setPrice(500.0);
        set.add(order2);


        log.info("Order Information");
        set.forEach(data -> log.info(data.toString()));
    }
}
