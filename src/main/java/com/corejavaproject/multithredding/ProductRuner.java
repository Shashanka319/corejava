package com.corejavaproject.multithredding;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProductRuner {
    public static void main(String[] args) {
        Product product = new Product(101,"T-shirt",1000);
        Product product1 = new Product(102,"shirt",1000);
        Product product2 = new Product(103,"Bottle",100);
        Product product3 = new Product(104,"Bag",500);
        Product product4 = new Product(105,"Fan",10000);

        List<Product> productlist = Arrays.asList(product,product1,product2,product3,product4);

        Executor executor = Executors.newFixedThreadPool(5);
        executor.execute(product);
        executor.execute(product1);
        executor.execute(product2);
        executor.execute(product3);
        executor.execute(product4);


    }
}
