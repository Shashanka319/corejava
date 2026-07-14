package com.corejavaproject.basics.oops.abstraction;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2

public class Square extends Shape {
    float side;

    @Override
    void acceptInput(){
        Scanner square=new Scanner(System.in);
        log.info("Enter the side of the Side");
        side =square.nextFloat();
    }

    @Override
    void calculateArea(){
        area =side*side;

    }


}
