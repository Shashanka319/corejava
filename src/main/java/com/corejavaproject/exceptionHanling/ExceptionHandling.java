package com.corejavaproject.exceptionHanling;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ExceptionHandling {
    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        int res = 0;
        try{
            exceptionHandling.divide(10,2);
        }catch (InvalidInput ex){
            ex.printStackTrace();
        }
        log.info("Response:{}",res);
        int result = 0;
        try{
            exceptionHandling.divide(10,2);
        }catch (InvalidInput ex){
            ex.printStackTrace();
        }
        log.info("Response:{}",result);

    }
    public int divide(int a, int b) throws InvalidInput{
        if(a <=0 || b<=0){
            throw new InvalidInput("Invalid input");
        }
        int c=0;
        try{
            c=a/b;
        }catch (ArithmeticException | NullPointerException e){
            e.printStackTrace();
        }finally {
            log.info("######Finally#########");
        }
        log.info("output:{}",c);
        return c;
    }

    public int division(int a,int b)  throws InvalidInput{
        if(a<=0 || b<=0){
            throw new InvalidInput("Invalid input");
        }
        int c=0;
        try{
            c=a/b;
        }finally {
            log.info("Final Answer:{}",c);
        }
        return c;

    }
}
