package com.corejavaproject.basics.oops.interfaces;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Dog implements Animal {
    static String ANIMAL_NAME = "Dog";
    @Override
    public void move() {
        log.info("Dog is Running");
    }
}
