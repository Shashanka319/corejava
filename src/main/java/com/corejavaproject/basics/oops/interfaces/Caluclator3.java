package com.corejavaproject.basics.oops.interfaces;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2

public class Caluclator3 implements Calucalator{
    @Override
    public void sum() {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a==0 && b==0){
           log.info("The Value is Zero so Add some value");

        }else{
            int sum=a+b;
            log.info("The Sum is:{}",sum);
        }

    }

    @Override
    public void sub() {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a==0 && b==0){
            log.info("The Value is Zero so Add some value");

        }else{
            int sub=a-b;
            log.info("The Result is:{}",sub);
        }


    }
}
