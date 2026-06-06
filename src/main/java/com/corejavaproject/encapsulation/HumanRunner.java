package com.corejavaproject.encapsulation;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class HumanRunner {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Shashanka");
        human.setAge(22);
        log.info("Human Age:"+ human.getAge());
        log.info("Human Name:"+human.getName());




    }
}
