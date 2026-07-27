package com.corejavaproject.comparator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
@Setter
@ToString
@Log4j2

public class Product {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(103);
        product.setName("TShirt");
        product.setPrice(1222.5);

        Product product1 = new Product();
        product1.setId(101);
        product1.setName("Shirt");
        product1.setPrice(1222.5);

        Product product2 = new Product();
        product2.setId(102);
        product2.setName("Fan");
        product2.setPrice(1222.5);

        List<Product> list = new ArrayList<>();
        list.add(product);
        list.add(product1);
        list.add(product2);

        list.sort(Comparator.comparing(Product ::getId));
        list.forEach(System.out::println);

        


    }
    int id;
    String name;
    double price;
}
