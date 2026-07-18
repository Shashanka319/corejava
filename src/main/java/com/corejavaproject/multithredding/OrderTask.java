package com.corejavaproject.multithredding;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class OrderTask implements Runnable{

    @Override
    public void run() {
        log.info(Thread.currentThread().getName()+"Started");
        try{
            Thread.sleep(90000);
        }catch(InterruptedException exp){
            log.error("InterruptedException");
        }
        log.info(Thread.currentThread().getName()+"Completed");
    }
}
