package com.corejavaproject.exceptionpractice;

public class Beta {
    public void method2(){
        System.out.println("Establish the Connection");
        Alpha a = new Alpha();
        a.method1();
        System.out.println("Destroy the Connection");
    }
}
