package com.corejavaproject.exceptionpractice;

public class Alpha {
    public void method1(){
        System.out.println("Establish the Connection");
        Division d=new Division();
        d.getDivision();
        System.out.println("Destroy the Connection");
    }
}
