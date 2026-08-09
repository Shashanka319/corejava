package com.corejavaproject.multithredding;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


@Log4j2
public class ServiceRunner {
    public static void main(String[] args) {
        final CountDownLatch countDownLatch = new CountDownLatch(3);
        Runnable runnable = ()->{
            log.info("Process started");
            try{
                Thread.sleep(5000);

            }catch(InterruptedException e){
                e.printStackTrace();
            }
            log.info("Process stopped");
            countDownLatch.countDown();
        };
        Runnable runnable1 = ()->{

            log.info("Fourth Thread ");
            try{
                Thread.sleep(3000);

            }catch(InterruptedException e){
                e.printStackTrace();
            }
            log.info("Fourth Thread Completed");
            countDownLatch.countDown();
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();

        Thread thread3 = new Thread(runnable);
        thread3.start();

        Thread thread4 = new Thread(runnable1);

        try{
            countDownLatch.await();
            thread4.start();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
