package com.corejavaproject.mutlithreadingpractice.countdownlatch;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.CountDownLatch;
@Log4j2
public class Metro {
    CountDownLatch latch;
    Metro(CountDownLatch latch){
        this.latch = latch;
    }
    public void getLatch(){
        System.out.println("Taking ticket from counter");
        try{
            Thread.sleep(8000);
        }catch (InterruptedException e){
            log.error("Issues occur while ticket taking",e);
        }
        log.info("Ticket confirmed");
        latch.countDown();
    }
}
