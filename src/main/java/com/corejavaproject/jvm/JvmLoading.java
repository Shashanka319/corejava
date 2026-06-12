package com.corejavaproject.jvm;

public class JvmLoading {
    static class GFG{

        static{

            System.out.println("GFG class is loaded by the JVM!");
        }

        public void display(){

            System.out.println("Method of GFG class is executed.");
        }
    }


}
