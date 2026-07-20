package com.corejavaproject.exceptionpractice;

import lombok.extern.log4j.Log4j2;

@Log4j2

public class ExceptionRunner {
    public static void main(String[] args) {
        ExceptionExample exceptionExample = new ExceptionExample();
        String inputFileName = "C:\\Xworkz Internship\\oops\\src\\main\\resources\\inputFile";
        String outputFile = "C:\\Xworkz Internship\\oops\\src\\main\\resources\\outputFile";

        try {
            exceptionExample.readFromFile(inputFileName, outputFile);
        } catch (FileNotFoundException e) {
            log.error(e.getMessage());
        }

    }

}
