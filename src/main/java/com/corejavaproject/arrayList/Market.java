package com.corejavaproject.arrayList;

public class Market {
    private String product;
    private int id;
    private double price;

    Market(String product, int id, double price){
        this.product=product;
        this.id=id;
        this.price=price;
    }

    public int getIdd(){
        return id;
    }

    public  String getProducts(){
        return product;
    }




}
