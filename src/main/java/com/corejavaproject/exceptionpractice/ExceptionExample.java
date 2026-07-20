package com.corejavaproject.exceptionpractice;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
@Log4j2

public class ExceptionExample {
    public void readFromFile(String inputFile,String outputFile) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        log.info("Reading and writing process is start");
        try{
            fileInputStream  = new FileInputStream(inputFile);
            fileOutputStream  = new FileOutputStream(outputFile);
            int data;
            while ((data = fileInputStream.read())!= -1){
                fileOutputStream.write(data);
            }
            log.info("Successfully read data from file");
        }catch (Exception e){
            log.error("Exception occured while reading file");
        }finally {
            log.info("File closed");
        }
    }
}
