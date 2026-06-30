package com.corejavaproject.exceptionHanling;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
@Log4j2

public class Handling {
    public static void main(String[] args) {
        Exception2 exception2= new Exception2();
        log.info("Enter the values for division:");

        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        int result =exception2.divide(input1, input2);
        log.info("Final Result:{}",result);

        int exeption=exception2.readInt(input1,input2);
        log.info("Exeption:{}",exeption);


    }
    public int divide(int input1,int input2){
        log.info("Division Method:input1={},input2={}",input1,input2);
        int result=0;
        try {
            result = input1 / input2;
        }catch (ArithmeticException e){
            log.error("Arithmetic Exception:{}",e);
        }
        log.info("Result of Division Method:{}",result);
        return result;
    }

    public int division(int number1,int number2){
        log.info("Division Method:number1={},number2={}",number1,number2);
        int result=0;
        try{
            result=number1 / number2;
        }catch (ArithmeticException e){
            log.error("Arithmetic Exception:{}",e);
        }catch (NullPointerException  exp){
            log.error("Null Pointer Exception:{}",exp);
        }catch (Exception e){
            log.error("Exception:{}",e);
        }
        log.info("Result of Division Method:{}",result);
        return result;
    }
    public int division2(int number1,int number2){
        log.info("Division MethodL:number1={},number2={}",number1,number2);
        int result=0;
        try{
            result=number1 / number2;
        }
        catch(ArithmeticException | NullPointerException ecp){
            log.error("Arithmetic Exception:{}",ecp);
        }
        catch (Exception e){
            log.error("Exception:{}",e);
        }
        log.info("Result of Division MethodL:{}",result);
        return result;
    }
    public int readInt(int input1,int input2){
        int result=0;
        try{
            result=input1 / input2;
        }
        catch(ArithmeticException | NullPointerException e){
            log.error(" Exception Block:{}",e);
        }catch (Exception e){
            log.error("Exception:{}",e);
        }finally {
            log.info("Finally bolck Executed:{}");
        }
        return result;
    }
}
