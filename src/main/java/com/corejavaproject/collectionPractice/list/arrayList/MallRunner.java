package com.corejavaproject.collectionPractice.list.arrayList;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
@Log4j2

public class MallRunner {
    public static void main(String[] args) {
        List<Mall> list = new ArrayList<>();
        log.info("Execute the Arraylist Collection(Ordered Collection):");
        log.info("Mall Informations in Bangalore:");
        Mall mall = new Mall();
        mall.setName("KPN Mall");
        mall.setLocation("ShikariPalya Niladri Nagar Bangalore");
        mall.setStoreManager("Dushanth");
        list.add(mall);

        Mall mall1 = new Mall();
        mall1.setName("Vishal Mart");
        mall1.setLocation("Niladri Nagar Bangalore");
        mall.setStoreManager("Nagaraj");
        list.add(mall1);

        Mall mall2 = new Mall();
        mall2.setName("Dmart");
        mall2.setLocation("Bommasandra Electranic City");
        mall2.setStoreManager("Sharath");
        list.add(mall2);

        Mall mall3 = new Mall();
        mall3.setName("KPN Mall");
        mall3.setLocation("Basapura Bangalore");
        mall3.setStoreManager("Prakash");
        list.add(mall3);
        list.forEach(log::info);

    }
}
