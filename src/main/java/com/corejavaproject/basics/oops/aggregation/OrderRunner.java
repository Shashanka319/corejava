package com.corejavaproject.basics.oops.aggregation;

public class OrderRunner {
    public static void main(String[] args) {
        Order order = new Order("DMart","Electranic City","Shashank",9743873982L,new Payment(true,"T-Shirt",1000.0));
        order.getInfo();
    }

}
