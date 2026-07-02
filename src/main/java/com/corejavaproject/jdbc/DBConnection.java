package com.corejavaproject.jdbc;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
@Log4j2

@Log4j2


public class DBConnection {
    public static Connection getConnection(){
        Connection connection = null;
        try(FileInputStream fileInputStream = new FileInputStream(
                "C:\\Xworkz Internship\\oops\\src\\main\\resources\\application.properties")){
            Properties properties = new Properties();
            log.info("properties loaded"+properties.load(fileInputStream));

            // create a connection
            connection = DriverManager.getConnection(properties.getProperty("db.url"), properties.getProperty("db.username"),
                    properties.getProperty("db.password"));

        } catch (Exception ex){
            log.error("Exception while connecting to DB", ex);
        }
        return connection;
    }
}
