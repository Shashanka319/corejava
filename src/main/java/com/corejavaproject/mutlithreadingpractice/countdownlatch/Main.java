package com.corejavaproject.mutlithreadingpractice.countdownlatch;

import java.sql.SQLOutput;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch l1 = new CountDownLatch(3);

        CountDown c2 = new CountDown("AlertService",6000,l1);
        CountDown c3 = new CountDown("ValidationService",9000,l1);

        Runnable r1 = () ->{
            CountDown c1 = new CountDown("CacheService",3000,l1);
            c1.getCountDown();
        };
        Runnable r2 = () ->{
            c2.getCountDown();
        };
        Runnable r3 = () ->{
            c3.getCountDown();
        };

        Runnable r4 = () ->{
            try{
                l1.await();
                System.out.println("4th thread is Start to execute");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

       // l1.await(1, TimeUnit.MINUTES);
       // System.out.println("main thread start to executing");

    }
}
