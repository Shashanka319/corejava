package com.corejavaproject.multithredding;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.CountDownLatch;
@Log4j2
public class Service  {
    public  String name;
    public  int timeToStart;
    public  CountDownLatch countDownLatch;

    public Service(String name, int timeToStart, CountDownLatch countDownLatch) {
        this.name = name;
        this.timeToStart = timeToStart;
        this.countDownLatch = countDownLatch;
    }
    public void run(){
        System.out.println("Starting " + name);
        try{
            Thread.sleep(timeToStart);
        }catch(InterruptedException e){
            log.error(e.getMessage());
        }
        System.out.println(name+" is running");
    }
}
