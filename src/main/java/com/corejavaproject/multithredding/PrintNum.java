package com.corejavaproject.multithredding;

public class PrintNum extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
