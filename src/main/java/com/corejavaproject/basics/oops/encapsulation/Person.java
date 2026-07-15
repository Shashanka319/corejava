package com.corejavaproject.basics.oops.encapsulation;

import lombok.extern.log4j.Log4j2;
@Log4j2
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0){
            this.age = age;
        }else {
            log.info("Age is invalid check once");
        }

    }
}
