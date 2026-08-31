package com.corejavaproject.mutlithreadingpractice.semaphore;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.Semaphore;
@Log4j2
public class CarParking {
    Semaphore semaphore;
    public CarParking(Semaphore semaphore) {
        this.semaphore = semaphore;
    }
    public  void park(String car){
        try{
            log.info(car+" is try to park");
            semaphore.acquire();
            log.info(car+" has parked");
            Thread.sleep(3000);
            log.info(car+"is leaving");
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }
}
