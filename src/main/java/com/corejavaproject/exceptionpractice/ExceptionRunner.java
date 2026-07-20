package com.corejavaproject.exceptionpractice;

public class ExceptionRunner {
    public static void main(String[] args) {
        ExceptionExample exceptionExample = new ExceptionExample();
        String inputFileName  ="C:\\Xworkz Internship\\oops\\src\\main\\resources\\inputFile";
        String outputFile = "C:\\Xworkz Internship\\oops\\src\\main\\resources\\outputFile";
        exceptionExample.readFromFile(inputFileName, outputFile);


    }
}
