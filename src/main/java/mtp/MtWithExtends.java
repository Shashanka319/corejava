package mtp;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class MtWithExtends extends Thread{
    public static void main(String[] args) {
        MtWithExtends mt = new MtWithExtends();
        mt.start();

        MtWithExtends mt2 = new MtWithExtends();
        mt2.run();

    }
    @Override
    public void run(){
        log.info(getName()+"Start the Thread Process");
        try{
            sleep(3000);
        }catch(InterruptedException e){
            log.error(e);
        }
        log.info(getName()+"close the Thread Process");
    }

}
