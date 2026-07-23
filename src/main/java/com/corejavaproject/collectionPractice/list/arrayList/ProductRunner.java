package com.corejavaproject.collectionPractice.list.arrayList;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
@Log4j2

public class ProductRunner {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Product product = new Product();
        log.info("Product Information in Mall");
        product.setProductId(101);
        product.setProductName("T-Shirt");
        product.setStockAvailable(true);
        product.setProductPrice(560.0);
        list.add(product);
        list.forEach(log::info);
    }
}
