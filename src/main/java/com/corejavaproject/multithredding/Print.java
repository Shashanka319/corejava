package com.corejavaproject.multithredding;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Print {
    synchronized void prints(){
        log.info(Thread.currentThread().getName()+"inside the Print method");
        try{
            Thread.sleep(9000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        log.info(Thread.currentThread().getName()+"exist the Print method");
    }
}
