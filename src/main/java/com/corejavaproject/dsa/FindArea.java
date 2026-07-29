package com.corejavaproject.dsa;

import java.util.Scanner;

public class FindArea {
    public static void main(String[] args) {
        System.out.println("Find the Area of Squre");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float c = a * a;
        System.out.println("The area of the Squre is:"+ c);

        int b = sc.nextInt();
        System.out.println("The area of the Rectangle is:"+a*b);

        float d = (3.14f)*a*a;
        System.out.println("Area of Circle is:"+d);
    }
}
