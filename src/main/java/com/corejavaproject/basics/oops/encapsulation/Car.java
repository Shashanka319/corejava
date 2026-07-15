package com.corejavaproject.basics.oops.encapsulation;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Car {
    String name;
    String type;
    double price;
    public Car(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    public void getDetailes(){
        log.info("Car Name:{}", name);
        log.info("Car Type:{}", type);
        log.info("Car Price:{}", price);
    }

}
