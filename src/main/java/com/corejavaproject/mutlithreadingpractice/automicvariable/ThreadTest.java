package com.corejavaproject.mutlithreadingpractice.automicvariable;

import lombok.ToString;

public class ThreadTest {
    static final int NUMBER_THREADS = 100;
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("Intitial Counter = " + counter.get());

        UpdatedThread[] threads = new UpdatedThread[NUMBER_THREADS];

        for (int i = 0; i < NUMBER_THREADS; i++) {
            threads[i] = new UpdatedThread(counter);
            threads[i].start();
        }
        for (int i = 0; i < NUMBER_THREADS; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Final Counter = " + counter.get());
    }
}
