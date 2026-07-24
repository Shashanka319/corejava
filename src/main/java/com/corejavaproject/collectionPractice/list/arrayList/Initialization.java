package com.corejavaproject.collectionPractice.list.arrayList;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
@Log4j2

public class Initialization {

    public void getAllDetailes() {
        List<Product> list = new ArrayList<>();
        Mall mall = new Mall();
        mall.setName("D-Mart");
        mall.setLocation("Bommasandra");
        mall.setStoreManager("Rajendra");

        UserInfo users = new UserInfo();
        users.setUserName("Shashank");
        users.setEmail("sharathshashank1986@gmail.com");
        users.setAddress("Niladri Nagar");
        users.setPhoneNumber(9743873982L);

        Product product = new Product();
        product.setMall(mall);
        product.setProductId(101);
        product.setProductName("T-shirt");
        product.setStockAvailable(true);
        product.setProductPrice(560.0);
        product.setUserInfo(users);


        UserInfo users1 = new UserInfo();
        users1.setUserName("Sharath");
        users1.setEmail("shashank1727@gmail.com");
        users1.setAddress("Electranic city");
        users1.setPhoneNumber(9743873982L);

        Product product1 = new Product();
        product1.setMall(mall);
        product1.setProductId(102);
        product1.setProductName("Fan");
        product1.setStockAvailable(true);
        product1.setProductPrice(6560.0);
        product1.setUserInfo(users1);


        UserInfo users2 = new UserInfo();
        users2.setUserName("Sharath");
        users2.setEmail("sharat657@gmail.com");
        users2.setAddress("Hulimangala");
        users2.setPhoneNumber(9743873982L);

        Product product2 = new Product();
        product2.setMall(mall);
        product2.setProductId(103);
        product2.setProductName("Wahing machine");
        product2.setStockAvailable(true);
        product2.setProductPrice(15560.0);
        product2.setUserInfo(users2);

        list.add(product);
        list.add(product1);
        list.add(product2);
        list.forEach(data -> log.info(data));

    }


}
