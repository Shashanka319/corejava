package com.corejavaproject.comparable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@ToString
@Log4j2
public class Product implements Comparable<Product>{
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(2);
        product.setName("T-shirts");
        product.setAvailable(true);
        product.setPrice(767.9);

        Product product1 = new Product();
        product1.setId(3);
        product1.setName("shirts");
        product1.setAvailable(true);
        product1.setPrice(4551.0);

        Product product2 = new Product();
        product2.setId(1);
        product2.setName("Fan");
        product2.setAvailable(true);
        product2.setPrice(50001.0);

        List<Product> list = new ArrayList<Product>();
        list.add(product);
        list.add(product1);
        list.add(product2);

        Collections.sort(list);
        list.forEach(System.out::println);

    }
    int id;
    String name;
    boolean available;
    double price;

    @Override
    public int compareTo(Product o) {
        return Double.compare(price, o.price);
    }
}
