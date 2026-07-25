package mtp;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoin threadJoin = new ThreadJoin();
        Runnable runnable = ()->{
            try {
                threadJoin.join();
            }catch (Exception e){
                log.error(e);
            }
        };
        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread.start();
        thread.join();
        thread2.start();

    }
    public void join(){
        log.info(Thread.currentThread().getName()+"join method Started");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info(Thread.currentThread().getName()+"join method Ended");
    }
}
