package com.corejavaproject.multithredding;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.Semaphore;
@Log4j2
public class Presentation {
    Semaphore semaphore = new Semaphore(3);
    public void vision(String student){
        try{
            log.info(student +"Students are try to presenting");
            semaphore.acquire();
            log.info("Student give Seminar"+student);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        finally{
            semaphore.release();
        }
    }
}
