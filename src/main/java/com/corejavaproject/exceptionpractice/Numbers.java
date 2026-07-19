package com.corejavaproject.exceptionpractice;

import java.util.Scanner;

public class Numbers {
    public void normalProcess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1st number");
        int a = scanner.nextInt();
        System.out.println("Please enter 2nd number");
        int b = scanner.nextInt();
        System.out.println("Result:"+a/b);
    }

    public void getdivision(){
        System.out.println("Execute the Process of Exception Hndling");
        System.out.println("Enter the first Number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        try{
            System.out.println("Enter the second Number");
            int b= scan.nextInt();
            int c = a/b;
            System.out.println("The sum is"+c);
        }catch(Exception ex){
            System.out.println("Invalid Input,Not give the Non Zero input in denomintor ");

        }
        System.out.println("Complete the Process of Exception Hndling");
    }

    public void getMultipleCatch(){
        System.out.println("Execute the Process of Exception Hndling");
        try{
            Scanner 
        }

    }




}
