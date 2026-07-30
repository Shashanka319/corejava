package com.corejavaproject.jdbcwithoracle;
import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

@Log4j2
public class DBConnection {
    public static Connection getConnection(){
        log.info("Connecting to database...");
        Connection connection = null;
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Xworkz Internship\\oops\\src\\main\\resources\\applications.properties")){
            Properties properties = new Properties();
            properties.load(fileInputStream);

            // create a connection
            connection = DriverManager.getConnection(properties.getProperty("db1.url"),
                    properties.getProperty("db1.username"),
                    properties.getProperty("db1.password"));

        } catch (Exception ex){
            log.error("Exception while connecting to DB", ex);
        }
        log.info("DB connection is Successfully established");

        return connection;
    }
}