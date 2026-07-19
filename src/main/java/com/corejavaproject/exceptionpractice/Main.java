package com.corejavaproject.exceptionpractice;

public class Main {
    public static void main(String[] args) {
        System.out.println("Establish the Connection");
        Gamma g =  new Gamma();
       // try{
        //    g.method3();
        //}catch (Exception e){
          //  e.printStackTrace();
        //}
        g.method3();

        System.out.println("Destroy the Connection");
    }
}
