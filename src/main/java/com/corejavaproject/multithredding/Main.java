package com.corejavaproject.multithredding;

public class Main {
    public static void main(String[] args) {
        OrderTask orderTask1 = new OrderTask();
        OrderTask orderTask2 = new OrderTask();

        Thread thread1 = new Thread(orderTask1);
        thread1.run();

        Thread thread2 = new Thread(orderTask2);
        thread2.start();
    }
}
