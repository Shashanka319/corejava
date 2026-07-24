package com.corejavaproject.multithredding;

public class ProessWithRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Start the ProessWithRunnable");
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("End the ProessWithRunnable");
    }
}
