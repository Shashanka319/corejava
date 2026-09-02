package com.corejavaproject.mutlithreadingpractice.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer {
    BlockingQueue<Object> queue=null;
    Producer(BlockingQueue<Object> queue){
        this.queue = queue;
    }

    public void produce(){
        while(true){
            try{
                Object o=getResource();
                queue.put(o);
                System.out.println("Producer Resource - Queue sixe now :"+queue.size());

            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }
    public Object getResource(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Thread interrupted");
        }
        return new Object();
    }
}
