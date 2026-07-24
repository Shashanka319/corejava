package com.corejavaproject.multithredding;

import java.util.Scanner;

public class Adding extends Thread{
    @Override
    public void run() {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first Number");
            int a =sc.nextInt();
            System.out.println("Enter the second Number");
            int b = sc.nextInt();
            int c = a + b;
            System.out.println("Result:"+c);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
