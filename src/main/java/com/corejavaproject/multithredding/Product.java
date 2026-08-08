package com.corejavaproject.multithredding;

import lombok.Getter;

@Getter

public class Product implements Runnable{
    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    @Override
    public void run() {
        try{
            System.out.println("Start the execution of Product ");
            Thread.sleep(4000);
            System.out.println("End the execution of Product ");
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
