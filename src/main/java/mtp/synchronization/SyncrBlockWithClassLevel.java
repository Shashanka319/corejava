package mtp.synchronization;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class SyncrBlockWithClassLevel {
    public static void main(String[] args) {
        SyncrBlockWithClassLevel scb = new SyncrBlockWithClassLevel();
        Runnable r = scb::getClassLevel;
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();

        SyncrBlockWithClassLevel scb1 = new SyncrBlockWithClassLevel();
        Runnable r1 = scb1::getClassLevel;
        Thread t3= new Thread(r1);
        Thread t4 = new Thread(r1);
        t3.start();
        t4.start();
    }
    public void getClassLevel(){
        synchronized (SyncrBlockWithClassLevel.class){
            log.info(Thread.currentThread().getName()+"Execute the getClassLevel bock in SyncroBlock");
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        log.info(Thread.currentThread().getName()+"Execute without locking");
    }
}
