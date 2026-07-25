package mtp;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Wait {
    public static void main(String[] args) {
        Wait w=new Wait();
        Runnable runnable = w::getWait;
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
    }
    public synchronized void getWait(){
        log.info("Waiting Starting");
        try{
            wait(9000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        log.info("Waiting Ending");
    }
}
