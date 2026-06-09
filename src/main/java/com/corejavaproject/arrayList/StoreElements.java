package com.corejavaproject.arrayList;


import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Log4j2

public class StoreElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        list.add(120);
        log.info("Storing ELements:"+list);
        Collections.reverse(list);
        log.info("Reversing ELements:"+list);

    }


}
