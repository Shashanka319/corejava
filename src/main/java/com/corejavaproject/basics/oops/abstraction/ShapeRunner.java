package com.corejavaproject.basics.oops.abstraction;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape square = new Square();
        square.acceptInput();
        square.calculateArea();
        square.display();

        Shape rectangle = new Rectangle();
        rectangle.acceptInput();
        rectangle.calculateArea();
        rectangle.display();

        Shape circle = new Circle();
        circle.acceptInput();
        circle.calculateArea();
        circle.display();



// reducing the code through create extra class with parameteraized method (Parent ref)
        GeoMetry geoMetry = new GeoMetry();
        geoMetry.getGeometry(square);
        geoMetry.getGeometry(rectangle);
        geoMetry.getGeometry(circle);




    }
}
