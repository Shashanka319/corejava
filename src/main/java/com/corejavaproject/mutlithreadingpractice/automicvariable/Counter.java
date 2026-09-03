package com.corejavaproject.mutlithreadingpractice.automicvariable;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger ai = new AtomicInteger();

    public void increment() {
        ai.incrementAndGet();
    }
    public void decrement() {
        ai.decrementAndGet();
    }
    public int get() {
        return ai.get();
    }

}
