package mtp.synchronization;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class SyncrBlockWithObjLevel {
    public static void main(String[] args) {
        SyncrBlockWithObjLevel sbol = new SyncrBlockWithObjLevel();
        Runnable r = sbol::getObj;
        Thread t1 = new Thread(r);
        t1.start();
        Thread t2 = new Thread(r);
        t2.start();

        SyncrBlockWithObjLevel sbol1 = new SyncrBlockWithObjLevel();
        Runnable r1 = sbol1::getObj;
        Thread t3 = new Thread(r1);
        t3.start();
        Thread t4 = new Thread(r);
        t4.start();
    }
    public void getObj(){
        synchronized (this){
            log.info("entering the process");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
        }
        log.info("without waiting the thread can hfgexiting the process");
    }
}
