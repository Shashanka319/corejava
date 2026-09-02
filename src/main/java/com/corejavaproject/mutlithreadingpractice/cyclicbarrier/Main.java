package com.corejavaproject.mutlithreadingpractice.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(4,()->{
            System.out.println("The barrier thread executing...");
        });

       Runnable r1 = ()->{
           Barrier b1 = new Barrier(cb);
           b1.getBarrier();
       };

       Runnable r2 = ()->{
           Barrier b2 = new Barrier(cb);
           b2.getBarrier();
       };
       Runnable r3 = ()->{
           Barrier b3 = new Barrier(cb);
           b3.getBarrier();
       };
       Runnable r4 = ()->{
           Barrier b4 = new Barrier(cb);
           b4.getBarrier();
       };

       Thread thread1 = new Thread(r1);
       Thread thread2 = new Thread(r2);
       Thread thread3 = new Thread(r3);
       Thread thread4 = new Thread(r4);
       thread1.start();
       thread2.start();
       thread3.start();
       thread4.start();
       cb.reset();


    }
}
