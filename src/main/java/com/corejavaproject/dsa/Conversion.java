package com.corejavaproject.dsa;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int c = sc.nextInt();

        //test cases : 30 -86
        //test cases : 40 -104
        //test cases : 42-107.6

        //float f =((c*9/5f)+32);
        //System.out.println(f);

        double f1 = (c*9/5f)+32;
        System.out.printf("%.1f",f1);



    }
}
