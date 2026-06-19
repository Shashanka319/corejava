package com.corejavaproject.collectionPractice.set.linkedHashSet;

import lombok.extern.log4j.Log4j2;

import java.util.LinkedHashSet;
import java.util.Set;

@Log4j2

public class MallRunner {
    public static void main(String[] args) {
        Set<Mall> set = new LinkedHashSet<>();
        log.info("Execute the LinkedHashSet Collection(Ordered Collection):");
        log.info("Mall Informations in Bangalore:");
        Mall mall = new Mall();
        mall.setName("KPN Mall");
        mall.setLocation("ShikariPalya Niladri Nagar Bangalore");
        mall.setStoreManager("Dushanth");
        mall.setNoOFEmployees(21);
        mall.setJobVacancy(true);
        set.add(mall);

        Mall mall1 = new Mall();
        mall1.setName("Vishal Mart");
        mall1.setLocation("Niladri Nagar Bangalore");
        mall.setStoreManager("Nagaraj");
        mall.setNoOFEmployees(20);
        mall.setJobVacancy(false);
        set.add(mall1);

        Mall mall2 = new Mall();
        mall2.setName("Dmart");
        mall2.setLocation("Bommasandra Electranic City");
        mall2.setStoreManager("Sharath");
        mall2.setNoOFEmployees(200);
        mall2.setJobVacancy(true);
        set.add(mall2);

        Mall mall3 = new Mall();
        mall3.setName("KPN Mall");
        mall3.setLocation("Basapura Bangalore");
        mall3.setStoreManager("Prakash");
        mall3.setNoOFEmployees(21);
        mall3.setJobVacancy(true);
        set.add(mall3);

        set.forEach(log::info);

    }
}
