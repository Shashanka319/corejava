package mtp.deadlock;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Resource1 {
    public synchronized void getresource1(){
       log.info(Thread.currentThread().getName()+"Execute the Resourse 1");
       try {
           Thread.sleep(3000);
       }catch (InterruptedException e){
           e.printStackTrace();
       }
       log.info(Thread.currentThread().getName()+"Terminate the Resourse 2");
    }
}
