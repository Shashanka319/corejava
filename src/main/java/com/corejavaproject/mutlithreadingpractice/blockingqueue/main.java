package com.corejavaproject.mutlithreadingpractice.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class main {
    public static void main(String[] args) {
        BlockingQueue<Object> queue=new ArrayBlockingQueue<>(5);
        int noOfProducer=10;
        int noOfConsumer=4;
        Producer producer=new Producer(queue);
        Consumer consumer =new Consumer(queue);

        Runnable r1 = producer::produce;

        Runnable r2 = () -> {
            try {
                consumer.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };
        for(int i=0;i<noOfProducer;i++){
            new Thread(r1).start();
        }
        for(int i=0;i<noOfConsumer;i++){
            new Thread(r2).start();
        }
    }
}
