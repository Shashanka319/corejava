package mtp.deadlock;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Resourse2 {
    public synchronized  void getresource2(){
        log.info(Thread.currentThread().getName()+"Execute the Resourse2");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        log.info(Thread.currentThread().getName()+"Terminate the Resourse2");
    }
}
