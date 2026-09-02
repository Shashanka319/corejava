package com.corejavaproject.mutlithreadingpractice.cyclicbarrier;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

@Log4j2
public class Barrier {
    CyclicBarrier barrier;
    public Barrier(CyclicBarrier barrier){
        this.barrier =barrier;
    }
    public void getBarrier(){
        try{
         log.info("Threads are waiting for barrier thread thread executed");
         barrier.await();
        }catch(InterruptedException e){
            log.error(e.getMessage());
        }catch (BrokenBarrierException ex){
            log.error(ex.getMessage());
        }
    }
}
