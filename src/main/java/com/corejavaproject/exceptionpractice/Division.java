package com.corejavaproject.exceptionpractice;

import java.util.Scanner;

public class Division {
    public void getDivision(){
        System.out.println("Establish the Connection");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Result:"+(a/b));
        System.out.println("Destroy the Connection");

    }
}
