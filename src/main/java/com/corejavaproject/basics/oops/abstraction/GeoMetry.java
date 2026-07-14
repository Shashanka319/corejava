package com.corejavaproject.basics.oops.abstraction;

public class GeoMetry {
    void getGeometry(Shape shape){
        shape.acceptInput();
        shape.calculateArea();
        shape.display();
    }
}
