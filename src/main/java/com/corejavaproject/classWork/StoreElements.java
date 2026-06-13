package com.corejavaproject.classWork;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Log4j2

public class StoreElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bangalore");
        list.add("Chitradurga");
        list.add("Davanagere");
        log.info("First Element:{}",list.get(0));

        list.forEach(data -> log.info(data));

        Iterator<String> iterator = list.iterator();
        log.info("Array list in Iterator form");
        while(iterator.hasNext()) {
            log.info(iterator.next());
        }

    }

}
