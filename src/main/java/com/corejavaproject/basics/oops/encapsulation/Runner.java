package com.corejavaproject.basics.oops.encapsulation;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class Runner {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Shashank K");
        person.setAge(22);
        log.info("Peron Name:{}", person.getName());
        log.info("Peron Age:{}", person.getAge());

    }
}
