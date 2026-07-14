package com.corejavaproject.basics.oops.abstraction;

import lombok.extern.log4j.Log4j2;

@Log4j2

abstract  public class Shape {
    double area;
    abstract  void acceptInput();
    abstract void calculateArea();
    void display()
    {
        log.info("Area of this  Shape is: " + area);
    }

}
