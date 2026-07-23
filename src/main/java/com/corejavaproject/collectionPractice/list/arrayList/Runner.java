package com.corejavaproject.collectionPractice.list.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Product product = new Product();

        Mall mall = new Mall();
        mall.setName("D-Mart");
        mall.setLocation("Bommasandra");
        mall.setStoreManager("Rajendra");

        product.setMall(mall);
        product.setProductId(101);
        product.setStockAvailable(true);
        product.setProductName("T-shirt");

    }
}
