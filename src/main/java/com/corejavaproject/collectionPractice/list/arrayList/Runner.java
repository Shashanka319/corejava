package com.corejavaproject.collectionPractice.list.arrayList;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
@Log4j2

public class Runner {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Product product = new Product();

        Mall mall = new Mall();
        mall.setName("D-Mart");
        mall.setLocation("Bommasandra");
        mall.setStoreManager("Rajendra");

        User user = new User();
        user.setUserName("Shashank");
        user.setEmail("sharathshashank1986@gmail.com");
        user.setAddress("Niladri Nagar");
        user.setPhoneNumber(9743873982L);

        product.setMall(mall);
        product.setProductId(101);
        product.setProductName("T-shirt");
        product.setStockAvailable(true);
        product.setProductPrice(560.0);
        product.



        list.add(product);
        list.forEach(data -> log.info(data));



    }
}
