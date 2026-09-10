package com.corejavaproject.mutlithreadingpractice.executorframework.threadlocal;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocall {
    private static final AtomicInteger nextId = new AtomicInteger(0);

    private static final ThreadLocal<Integer> threadId = ThreadLocal.withInitial(() -> nextId.getAndIncrement());

    public int getThreadId() {
        return threadId.get();
    }
    private static final ThreadLocal<Date> startDate = ThreadLocal.withInitial(() -> new Date());

    public static void main(String[] args) {

        ThreadLocall threadLocall = new ThreadLocall();

        Runnable runnable = ()->{
            System.out.printf("Starting Thread: %s : %s\n", threadLocall.getThreadId(),startDate.get());
            try {
                TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("Thread Finished: %s : %s\n", threadLocall.getThreadId(),startDate.get());
        };

        Thread t1 = new Thread(runnable);
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.start();

        Thread t3 = new Thread(runnable);
        t3.start();
    }
}