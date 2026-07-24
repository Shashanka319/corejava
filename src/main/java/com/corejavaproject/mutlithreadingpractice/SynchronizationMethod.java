package com.corejavaproject.mutlithreadingpractice;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class SynchronizationMethod implements Runnable {
    @Override
    public  void run() {
        log.info( "Implementation of Synchronization Method using Runnable");
        super.toString();
    }
    public synchronized void objLocking(){
        log.info(Thread.currentThread().getName() + " Executing the ObjLocking in Synchronized Method started");
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        log.info(Thread.currentThread().getName() + " Terminating the ObjLocking in Synchronized Method finished");

    }
    public static synchronized void classLevelLock(){
        log.info(Thread.currentThread().getName() + " Executing the ClassLevelLock in Synchronized Method started");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        log.info(Thread.currentThread().getName() + " Terminating the ClassLevelLock in Synchronized Method finished");
    }

}
