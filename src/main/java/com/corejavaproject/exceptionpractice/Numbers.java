package com.corejavaproject.exceptionpractice;

import java.util.InputMismatchException;
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
        System.out.println("Execute the Process of Exception Handling");
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Size of Array");
            int size = scan.nextInt();
            int [] arr = new int[size];
            System.out.println("Enter the value:");
            int value = scan.nextInt();
            System.out.println("Enter the index:");
            int index = scan.nextInt();
            arr[index]=value;
            System.out.println(arr[index]);

        }catch(Exception ex){
            System.out.println("Invalid Input please check once ");

        }
        System.out.println("Complete the Process of Exception Handling");
    }

    public void getMultipleCatch(){
        System.out.println("Execute the Process of Exception Hndling");
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Size of Array");
            int size = scan.nextInt();
            int [] arr = new int[size];
            System.out.println("Enter the value:");
            int value = scan.nextInt();
            System.out.println("Enter the index:");
            int index = scan.nextInt();
            arr[index]=value;
            System.out.println(arr[index]);

        }catch (NegativeArraySizeException e){
            System.out.println("Give positive numbers");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("give the numbers within the Given Array size");
        }catch (InputMismatchException exp){
            System.out.println("Enter only numbers");
        }catch (Exception ex){
            System.out.println("Invalid Input");
        }
        System.out.println("Complete the Process of Exception Handling");
    }

    public void getFinally(){
        System.out.println("Execute the Process of Exception Hndling");
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Size of Array");
            int size = scan.nextInt();
            int [] arr = new int[size];
            System.out.println("Enter the value:");
            int value = scan.nextInt();
            System.out.println("Enter the index:");
            int index = scan.nextInt();
            arr[index]=value;
            System.out.println(arr[index]);

        }finally {
            System.out.println("Complete the Process of Exception Hndling");
        }
    }

    public void getALl(){
        System.out.println("Execute the Process of Exception Hndling");
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Size of Array");
            int size = scan.nextInt();
            int [] arr = new int[size];
            System.out.println("Enter the value:");
            int value = scan.nextInt();
            System.out.println("Enter the index:");
            int index = scan.nextInt();
            arr[index]=value;
            System.out.println(arr[index]);

        }catch (NegativeArraySizeException e){
            System.out.println("Give positive numbers");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("give the numbers within the Given Array size");
        }
        catch (InputMismatchException exp){
            System.out.println("Enter only numbers");
        }catch (Exception ex){
            System.out.println("Invalid Input");
        }
        finally {
            System.out.println("Complete the Process of Exception Handling");
        }
    }
}
