package com.corejavaproject.collectionPractice.list.arrayList;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Log4j2

public class ProductRunner {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        Product product = new Product();
        product.setProductId(101);
        product.setProductName("T-Shirt");
        product.setStockAvailable(true);
        product.setProductPrice(560.0);
        list.add(product);
        list.forEach(data -> log.info(data));


        Product product1 = new Product();
        product1.setProductId(102);
        product1.setProductName("Shirt");
        product1.setStockAvailable(true);
        product1.setProductPrice(1560.0);
        list.add(product1);
        list.forEach(log::info);

        Product product2 = new Product();
        product2.setProductId(103);
        product2.setProductName("Hat");
        product2.setStockAvailable(true);
        product2.setProductPrice(260.0);
        list.add(product2);
        for(Product get:list){
            log.info(get);
        }

        Product product3= new Product();
        product3.setProductId(104);
        product3.setProductName("Bag");
        product3.setStockAvailable(true);
        product3.setProductPrice(1260.0);
        list.add(product3);
        list.stream().map(data ->{
            data.setStockAvailable(false);
            data.setProductPrice(1750.0);
            return data;
        }).forEach(log::info);

        Product product4= new Product();
        product4.setProductId(105);
        product4.setProductName("Fan");
        product4.setStockAvailable(true);
        product4.setProductPrice(4560.0);
        list.add(product4);
        Iterator<Product> iterator = list.iterator();
        while(iterator.hasNext()){
            log.info(iterator.next());
        }

        Product product5= new Product();
        product5.setProductId(106);
        product5.setProductName("Shirt");
        product5.setStockAvailable(true);
        product5.setProductPrice(560.0);
        list.add(product5);
        ListIterator<Product> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            log.info(listIterator.next());
        }
        while(listIterator.hasPrevious()){
            log.info(listIterator.previous());
        }

    }
}
