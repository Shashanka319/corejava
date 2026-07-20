package com.corejavaproject.exceptionpractice;

import java.io.IOException;

public class ResourceRunner {
    public static void main(String[] args) {
        TryWithResource resource = new TryWithResource();
        String inputFile="C:\\Xworkz Internship\\oops\\src\\main\\resources\\readFile";
        String outputFile="C:\\Xworkz Internship\\oops\\src\\main\\resources\\writeFile";
        try{
            resource.getResource(inputFile,outputFile);
        }catch ( RaadNotFound ex){
            ex.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
