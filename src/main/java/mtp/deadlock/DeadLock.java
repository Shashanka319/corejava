package mtp.deadlock;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class DeadLock {
    public static void main(String[] args) {
        Resource1 r1 = new Resource1();
        Resource1 r2 = new Resource1();

        Runnable r = ()->{
            r1.getresource1();
            r2.getresource1();
        };
        Thread t1 = new Thread(()->{
            synchronized (r1){
                log.info("Access the Resource1");
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                log.info("Wating for Resource2");
            }
            synchronized (r2){
                log.info("Lock the Resource2");
            }
        });
        Thread t2 = new Thread(()->{
            synchronized (r){
                log.info("Access the Resource2");
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                log.info("Wating for Resource1");
            }
            synchronized (r1){
                log.info("Lock the Resource1");
            }
        });
        t1.start();
        t2.start();

    }
}
