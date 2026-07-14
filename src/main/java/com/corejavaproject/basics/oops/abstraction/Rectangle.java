package com.corejavaproject.basics.oops.abstraction;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;


@Log4j2

public class Rectangle extends Shape{
    double length;
    double breadth;

    @Override
    void acceptInput(){
        Scanner input = new Scanner(System.in);
        log.info("Enter the Length of the rectangle");
        length=input.nextDouble();
       log.info("Entert the breadth of the Rectangle:");
        breadth = input.nextDouble();
    }
    @Override

    void calculateArea(){
        area = length * breadth;
    }

}
