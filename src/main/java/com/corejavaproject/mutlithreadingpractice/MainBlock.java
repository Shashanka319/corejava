package com.corejavaproject.mutlithreadingpractice;

public class MainBlock {
    public static void main(String[] args) {
        SynchronizationBlock sb = new SynchronizationBlock();
        sb.objLevelLock();
        sb.classLevelLock();
        Thread t = new Thread(sb);
        t.start();

        SynchronizationBlock sb1 = new SynchronizationBlock();
        sb.objLevelLock();
        sb.classLevelLock();
        Thread t = new Thread(sb);
        t.start();

        SynchronizationBlock sb = new SynchronizationBlock();
        sb.objLevelLock();
        sb.classLevelLock();
        Thread t = new Thread(sb);
        t.start();


    }
}
