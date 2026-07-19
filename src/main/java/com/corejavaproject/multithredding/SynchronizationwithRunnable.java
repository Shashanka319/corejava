package com.corejavaproject.multithredding;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class SynchronizationwithRunnable {
    public void getSyncronization(){
        synchronized (this) {
            log.info(Thread.currentThread().getName() + " Execute the getSynchronization method");
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                log.error("Interrupted while waiting for the getSynchronization method");
            }
            log.info(Thread.currentThread().getName() + " End the Execution of getSynchronization method");
        }
    }
    public void execute(){
        synchronized (SynchronizationwithRunnable.class) {
            log.info(Thread.currentThread().getName() + " execute method started");
        }
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            log.error("Interrupted while waiting for the execute method");
        }
        log.info(Thread.currentThread().getName() + "end the execute the method");
    }
}
