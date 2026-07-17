package com.corejavaproject.jdbc;

import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
@Log4j2

public class DBConnections{
    public static Connection getConnection(){
        Connection connection =null;
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Xworkz Internship\\oops\\src\\main\\resources\\application.properties")){
            Properties properties = new Properties();
            properties.load(fileInputStream);
            connection=DriverManager.getConnection(
                    properties.getProperty("db.url"),
                    properties.getProperty("db.username"),
                    properties.getProperty("password")
            );
        }catch (Exception exp){
           log.error("The somthing wen Wrong please try Again, Check the Program once");
        }
        return connection;
    }
}
