package mtp;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MLWithRunnable implements Runnable {
    public static void main(String[] args) {
        MLWithRunnable ml = new MLWithRunnable();
        Thread t = new Thread(ml);
        t.start();
        Thread t2 = new Thread(ml);
        t2.start();


    }
    @Override
    public void run() {
       log.info(Thread.currentThread().getName()+"Starting the Runnable Process") ;
       try{
           Thread.sleep(3000);
       }catch (Exception e){
           e.printStackTrace();
       }
       log.info(Thread.currentThread().getName()+"Ending the Runnable Process") ;
    }
}
