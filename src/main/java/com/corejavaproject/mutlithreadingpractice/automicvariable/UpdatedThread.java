package com.corejavaproject.mutlithreadingpractice.automicvariable;

public class UpdatedThread extends Thread{
    private Counter counter;
    public UpdatedThread(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        counter.increment();
    }
}
