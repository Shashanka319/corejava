package com.corejavaproject.generics;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BoxRunner {
    public static void main(String[] args) {
        Box<String > box = new Box<>();
        box.setData("Shashank");
        log.info("Name:"+box.getData());


        Box<Integer > box1 = new Box<>();
        box1.setData(22);
        log.info("Age:"+box1.getData());
    }
}
