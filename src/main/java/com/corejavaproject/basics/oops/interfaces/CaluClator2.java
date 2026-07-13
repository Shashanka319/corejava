package com.corejavaproject.basics.oops.interfaces;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2

public class CaluClator2 implements Calucalator {
    @Override
    public void sum() {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter the First Number:");
        int a = scanner.nextInt();
        log.info("Enter the Second Number:");
        int b=scanner.nextInt();
        int c = a+b;
        log.info("Result of Total Sum :{}",c);

    }

    @Override
    public void sub() {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter the First Number:");
        int a = scanner.nextInt();
        log.info("Enter the Second Number:");
        int b = scanner.nextInt();
        int c = a-b;
        log.info("Result of Total Substraction :{}",c);

    }
}
