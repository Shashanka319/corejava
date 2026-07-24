package com.corejavaproject.multithredding;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Ticket extends Thread{
    public void run(){
        log.info(Thread.currentThread().getName()+"Started");
        try{
            Thread.sleep(9000);
        }catch(InterruptedException e){
            log.error("Interrupted Exception");
        }catch(Exception e){
            log.error("Exception In Thread");
        }
        log.info(Thread.currentThread().getName()+"Ended");
    }
}
