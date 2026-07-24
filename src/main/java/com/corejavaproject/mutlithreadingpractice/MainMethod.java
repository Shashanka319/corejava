package com.corejavaproject.mutlithreadingpractice;

public class MainMethod {
    public static void main(String[] args) {
        SynchronizationMethod sm = new SynchronizationMethod();
        sm.objLocking();
        SynchronizationMethod.classLevelLock();
        Thread thread1 = new Thread(sm);
        thread1.setName("SHASHANK");
        thread1.start();

        SynchronizationMethod sm1 = new SynchronizationMethod();
        sm1.objLocking();
        SynchronizationMethod.classLevelLock();
        Thread thread2 = new Thread(sm1);
        thread2.setName("SHARATH");
        thread2.start();

        SynchronizationMethod sm2 = new SynchronizationMethod();
        sm2.objLocking();
        SynchronizationMethod.classLevelLock();
        Thread thread3 = new Thread(sm2);
        thread3.setName("SHASHANK SHARU");
        thread3.start();

    }
}
