package com.corejavaproject.jdbc;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Properties;
@Log4j2

public class Connection {
    public static Connection getEmployeeConnection(){
        Connection connection = null;
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Xworkz Internship\\oops\\src\\main\\resources\\application.properties")){
            Properties properties = new Properties();
            properties.load(fileInputStream);
            connection = (Connection) DriverManager.getConnection(
                    properties.getProperty("db.url"),
                    properties.getProperty("db.username"),
                    properties.getProperty("db.password")
            );
        }catch(Exception exp){
            log.error("Error The program check once:{}",exp);
        }
        return connection;
    }
}
