package com.corejavaproject.basics.methods;

public class Product {
    public static String MART_NAME="D-Mart";
    String productName;
    int count;
    double price;
    boolean available;

    public Product(){
        this.productName="null";
        this.count=0;
        this.price=0;
        this.available=false;
    }
    public Product(String productName, int count, double price, boolean available) {
        this.productName = productName;
        this.count = count;
        this.price = price;
        this.available = available;
    }
    public static String getProductName(){
        return MART_NAME;
    }
    public void productDetailes(){
        System.out.println("Product Name : "+this.productName);
        System.out.println("Count : "+this.count);
        System.out.println("Price : "+this.price);
        System.out.println("Available : "+this.available);

    }

}
