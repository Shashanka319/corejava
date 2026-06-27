package com.corejavaproject.basics.methods;

public class ProductRunner {
    public static void main(String[] args) {
        Product product = new Product();
        Product product = Product.getProductName();
        System.out.println("Product Name:"+product);
        Product.productDetailes();
    }
}
