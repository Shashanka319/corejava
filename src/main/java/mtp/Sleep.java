package mtp;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Sleep {
    public static void main(String[] args) {
        Sleep sleep = new Sleep();
        Runnable r= ()  -> {
            sleep.getSleep();
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
    public synchronized void getSleep(){
        log.info("getSleep is Executed");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("getSleep is Done");
    }
}
