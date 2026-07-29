package com.corejavaproject.dsa;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
      getOR();
      getAND();
      print();
    }
    public static void getOR(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0 || a%3==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void getAND(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0 && a%3==0 && a%7==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void print(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0 && a%5==0 && a%10==0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
    public  static void print1(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%10==0){
            System.out.println("Yes");
        }else  {
            System.out.println("No");
        }
    }
    public static void print2(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%10==7){
            System.out.println("Yes");
        }else  {
            System.out.println("No");
        }
    }

}
