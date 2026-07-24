package com.corejavaproject.multithredding;

public class ExceptionMain {
    public static void main(String[] args) {
        Adding adding = new Adding();

        Printchar pc = new Printchar();
        PrintNum num = new PrintNum();

        ProessWithRunnable pro = new ProessWithRunnable();
        Runnable r = new ProessWithRunnable();
        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(r);
        t1.getName();
        t1.setName("Shashank");
        t1.start();
        t2.start();
       // adding.run();
       // pc.run();
       // num.run();


        //if you want to change or modify the thread data using extends way then you should create a Thread obj using that ref you can modify acc your requirements
        Thread t3 = new Thread(adding);
        t3.getName();
        adding.start();
        pc.start();
        num.start();
    }
}
