package com.corejavaproject.multithredding;

public class Printchar extends Thread{
    @Override
    public void run() {
        for (int i = 65; i <=69; i++) {
            System.out.println((char)i);

            try{
                Thread.sleep(3000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
