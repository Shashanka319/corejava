package com.corejavaproject.mutlithreadingpractice.semaphore;

import java.util.concurrent.Semaphore;

public class CarParkingRunner {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        CarParking cp = new CarParking(semaphore);
        for(int i= 1;i<=10;i++){
            final String car ="Car"+i;
            Thread thread = new Thread(()->{
                cp.park(car);
            });
            thread.start();
        }
    }
}
