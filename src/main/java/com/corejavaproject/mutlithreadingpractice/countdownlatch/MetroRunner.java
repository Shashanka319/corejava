package com.corejavaproject.mutlithreadingpractice.countdownlatch;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MetroRunner {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(4);

        Metro metro = new Metro(latch);
        Metro metro2 = new Metro(latch);
        Metro metro3 = new Metro(latch);
        Metro metro4 = new Metro(latch);

        Runnable r1 =metro::getLatch;
        Runnable r2 =metro2::getLatch;
        Runnable r3 =metro3::getLatch;
        Runnable r4 =metro4::getLatch;


        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        Runnable r5= () ->{
            try{
                latch.await();
                System.out.println("Thread5 waiting for other 4 threads process is executed");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };

        Thread t5 = new Thread(r5);
        t5.start();

        //latch.await(1, TimeUnit.MINUTES);
        //System.out.println("Start to travell in metro");
    }

}
