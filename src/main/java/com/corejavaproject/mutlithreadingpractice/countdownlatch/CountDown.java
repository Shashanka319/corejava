package com.corejavaproject.mutlithreadingpractice.countdownlatch;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.CountDownLatch;

@Log4j2
public class CountDown {
    String name;
    int timeToStart;
    CountDownLatch latch;
    public CountDown(String name, int timeToStart, CountDownLatch latch) {
        this.name = name;
        this.timeToStart = timeToStart;
        this.latch = latch;
    }
    public void getCountDown(){
        log.info("Start execute"+name);
        try{
            Thread.sleep(timeToStart);
        }catch (InterruptedException e){
            log.error(e.getMessage());
        }
        log.info(name+"is up");
        latch.countDown();
    }


}
