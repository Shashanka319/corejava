package com.corejavaproject.multithredding;

public class SynchroMain {
    public static void main(String[] args) {
        Synchronization synchronization = new Synchronization();
        Runnable runnable  = ()->{
            synchronization.print();
        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        Thread thread3 = new Thread(runnable);
        thread3.start();
    }
}
