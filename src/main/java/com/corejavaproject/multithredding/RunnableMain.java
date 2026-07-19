package com.corejavaproject.multithredding;

public class RunnableMain {
    public static void main(String[] args) {
        SynchronizationwithRunnable runnable = new SynchronizationwithRunnable();
        Runnable runnable1 =() ->{
            runnable.getSyncronization();
            runnable.execute();
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        Thread thread2 = new Thread(runnable1);
        thread2.start();

        Thread thread3 = new Thread(runnable1);
        thread3.start();


    }
}
