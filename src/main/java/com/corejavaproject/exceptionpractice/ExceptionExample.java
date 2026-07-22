package com.corejavaproject.exceptionpractice;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
@Log4j2

public class ExceptionExample {

    public void readFromFile(String inputFile,String outputFile)throws FileNotFoundException {
        if(inputFile==null){
            log.error("Input file is null");
            throw new FileNotFoundException("Input file is null");
        }
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
        } finally {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception e) {
                        log.error("Failed to close input stream", e);
                    }
                }

                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception e) {
                        log.error("Failed to close output stream", e);
                    }
                }
            }
    }


}
