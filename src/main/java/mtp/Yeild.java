package mtp;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Yeild {
    public static void main(String[] args) {
        Yeild yeild = new Yeild();
        Runnable r=()->{
            yeild.getYeild("emergency");
        };
        Thread t=new Thread(r);
        t.start();
        Thread t2=new Thread(r);
        t2.start();

        Yeild yeild2=new Yeild();
        Runnable r2=()->{
            yeild2.getYeild("regular");
        };
        Thread t3=new Thread(r2);
        t3.start();
    }
    public void getYeild(String patient){
        log.info("Patient coming to Hospital for Health Issue");
        if("emergency".equals(patient)){
            log.info("Doctor Shifted to Emergency");
            Thread.yield();
        }
        log.info("The Doctor can Check the Patient What Happened That patient");

    }
}
