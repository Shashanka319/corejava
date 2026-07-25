package mtp;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class MLWithLamdasExpression {
    public static void main(String[] args) {
        MLWithLamdasExpression ml = new MLWithLamdasExpression();
        Runnable r= ()  -> {
            ml.print();
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
    public void print(){
       log.info(Thread.currentThread().getName()+"Start the Print using Lamda expressions");
       try{
           Thread.sleep(3000);
       }catch(InterruptedException e){
           e.printStackTrace();
       }
       log.info(Thread.currentThread().getName()+"End the Print using Lamda expressions");
    }
}
