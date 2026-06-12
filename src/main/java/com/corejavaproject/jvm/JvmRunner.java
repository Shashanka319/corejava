package com.corejavaproject.jvm;

public class JvmRunner {
        public static void main(String[] args) throws Exception{

            System.out.println("Main method started.");

            // Loading the class explicitly using Class.forName()
            Class.forName("GFG");

            System.out.println("Class loaded successfully.");

            // Creating object to execute method
            JvmLoading.GFG obj = new JvmLoading.GFG();
            obj.display();
        }
}
