package com.corejavaproject.exceptionHanling;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2

public class ExceptionExample1 {
    public static void main(String[] args) {
        ExceptionExample1 exceptionExample1 = new ExceptionExample1();
        log.info("Enter the values for division:");

        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        int result =exceptionExample1.divide(input1, input2);
        log.info("Final Result:{}",result);

    }
    public int divide(int input1,int input2){
        log.info("Division Method:input1={},input2={}",input1,input2);
        int result=input1/input2;
        log.info("Result of Division Method:{}",result);
        return result;
    }
}
