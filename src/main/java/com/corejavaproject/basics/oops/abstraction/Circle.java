package com.corejavaproject.basics.oops.abstraction;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2

public class Circle extends Shape {
    float radius;

    @Override
    void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        log.info("Enter the Radius of the Circle");
        radius=scan.nextFloat();
    }

    @Override
    void  calculateArea()
    {
        area = (float) Math.PI*radius*radius;
    }

}
