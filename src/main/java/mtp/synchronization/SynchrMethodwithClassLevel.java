package mtp.synchronization;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class SynchrMethodwithClassLevel {
    public static void main(String[] args) {
        SynchrMethodwithClassLevel sm = new SynchrMethodwithClassLevel();
        Runnable r = () -> {
            getClassLevel();
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();

        SynchrMethodwithClassLevel sm2 = new SynchrMethodwithClassLevel();
        Runnable r1 = ()->{
            getClassLevel();
        };
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r1);
        t3.start();
        t4.start();
    }
    public static synchronized  void getClassLevel(){
        log.info(Thread.currentThread().getName()+"Execute the getClassLevel in SynchrMethod");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        log.info(Thread.currentThread().getName()+" Terminate the getClassLevel in SynchrMethod");
    }

}
