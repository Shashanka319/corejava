package com.corejavaproject.exceptionpractice;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
@Log4j2

public class TryWithResource {
    public void getResource(String inputFile, String outputFile) throws RaadNotFound{
        if(inputFile==null){
            log.error("Input file is null");
            throw new RaadNotFound("Input file is null");
        }

        log.info("Reading and writing process is start");
        try(FileInputStream fileInputStream = new FileInputStream(inputFile);
            FileOutputStream fileOutputStream = new  FileOutputStream(outputFile)){

            int data;
            while ((data = fileInputStream.read())!= -1){
                fileOutputStream.write(data);
            }
            log.info("Successfully read data from file");
        }catch (Exception e){
            log.error("Exception occured while reading file"+e);
        }
        log.info("Reading and writing process is end");
    }
}
