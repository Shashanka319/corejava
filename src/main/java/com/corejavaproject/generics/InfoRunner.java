package com.corejavaproject.generics;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class InfoRunner {
    public static void main(String[] args) {
        Informatiom<String,Integer> info = new Informatiom<>("Shashank",22);
        String name=info.getName();
        Integer age =info.getAge();
        log.info("Name:"+name);
        log.info("Age:"+age);
    }
}
