package com.corejavaproject.exceptionpractice;

public class Gamma {
    public void method3(){
        System.out.println("Establish the Connection");
        Beta b=new Beta();
        b.method2();
        System.out.println("Destroy the Connection");
    }
}
