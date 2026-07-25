package mtp.synchronization;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class SyncrMethodWithObj {
    public static void main(String[] args) {
        SyncrMethodWithObj sm = new SyncrMethodWithObj();
        Runnable r = sm::getObj;
        Thread t1 = new Thread(r);
        t1.start();
        Thread t2 = new Thread(r);
        t2.start();

        SyncrMethodWithObj sm2 = new SyncrMethodWithObj();
        Runnable r2 = sm2::getObj;
        Thread t3 = new Thread(r2);
        t3.start();
        Thread t4 = new Thread(r2);
        t4.start();
    }
    public synchronized void getObj(){
        log.info(Thread.currentThread().getName()+"Execute the getObj method in SyncronizedMethod");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        log.info(Thread.currentThread().getName()+"Terminate the getObj method in SyncronizedMethod");
    }
}
