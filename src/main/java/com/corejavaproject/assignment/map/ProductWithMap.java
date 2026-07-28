package com.corejavaproject.assignment.map;

import lombok.extern.log4j.Log4j2;

import java.util.HashMap;
import java.util.Map;
@Log4j2

public class ProductWithMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String , String>();
        map.put("1000", "T-shirt");
        map.put("1500", "Shirt");
        map.put("5000", "Fan");
        map.put("3000", "Mixer");

        map.forEach((k,v)->{log.info(k);log.info(v);});



    }
}
