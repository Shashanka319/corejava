package com.corejavaproject.exceptionpractice;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
@Log4j2

public class ExceptionExample {
    public void readFromFile(String inputFile,String outputFile) throws FileNotFoundException {
        try(FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);){
            int data;
            while ((data = fis.read())!= -1){
                fos.write(data);
            }
        }catch (Exception e){
            log.info("Exception occured while reading file");
        }
    }
}
