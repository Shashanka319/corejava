package com.corejavaproject.mutlithreadingpractice.automicvariable;

import java.util.concurrent.atomic.AtomicInteger;

class AutomaticCounter {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger seats = new AtomicInteger(10);

        Thread t1 = new Thread(() -> {
            seats.incrementAndGet();
            //seats.decrementAndGet();
            System.out.println("seat count thread1----" + seats.get());
        });

        Thread t2 = new Thread(() -> {

           // try {
           //     t1.join();
           // } catch (InterruptedException e) {
            //    throw new RuntimeException(e);
          //  }
            seats.incrementAndGet();
           // seats.decrementAndGet();
            System.out.println("seat count thread2---" + seats.get());
        });

        t1.start();
        t1.join();
        t2.start();
        t2.join();
       System.out.println("Final seats remaining: " + seats.get());


    }
}