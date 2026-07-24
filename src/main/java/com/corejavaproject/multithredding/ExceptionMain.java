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
        t1.start();
        t2.start();

       // adding.run();
       // pc.run();
       // num.run();
        adding.start();
        pc.start();
        num.start();
    }
}
