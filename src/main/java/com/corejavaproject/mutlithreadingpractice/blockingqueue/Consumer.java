package com.corejavaproject.mutlithreadingpractice.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer {
    BlockingQueue<Object> queue=null;
    public Consumer(BlockingQueue<Object> queue){
        this.queue=queue;
    }
    public void consume() throws InterruptedException {
       Object o=queue.take();
       System.out.println("Consumer Object - Queue size now :"+queue.size());
       take(o);

    }
    public void take(Object o){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println("Thread interrupted");
        }
        System.out.println("Consumer Resource - "+o);

    }
}
