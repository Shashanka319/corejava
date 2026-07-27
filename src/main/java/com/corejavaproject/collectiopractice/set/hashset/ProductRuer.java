package com.corejavaproject.collectiopractice.set.hashset;

import lombok.extern.log4j.Log4j2;

import java.util.HashSet;
import java.util.Set;
@Log4j2

public class ProductRuer
{
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("T-Shirt");
        product.setQuantity(3);
        product.setAvailable(true);
        product.setPrice(5000);
        Set<Product> set = new HashSet<>();
        set.add(product);

        Product product1 = new Product();
        product1.setName("T-Shirt");
        product1.setQuantity(3);
        product1.setAvailable(true);
        product1.setPrice(5000);
        Set<Product> set1 = new HashSet<>();
        set1.add(product1);

        set.forEach(log::info);


    }
}
