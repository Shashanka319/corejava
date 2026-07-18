package com.corejavaproject.multithredding;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class RunnableWithLamda {
    public static void main(String[] args) {
        Runnable runnable = () ->{
            log.info(Thread.currentThread().getName()+"Started");
            try{
                Thread.sleep(9000);
            }catch(InterruptedException e){
                log.error("InterruptedException",e);
            }
            log.info(Thread.currentThread().getName()+"Ended");
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
