package com.corejavaproject.dsa;

import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        int b = sc.nextInt();
        for(int i=2;i<=b;i++,i++){
            System.out.println(i);
        }
        int c= sc.nextInt();
        for(int i =1;i<=c;i=i+2){
            System.out.println(i);
        }

    }
}
