package com.corejavaproject.jdbcwithoracle;

import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
@Log4j2
public class Main {
    public static void main(String[] args) {
         Connection db=DBConnection.getConnection();
         log.info(db);
    }
}
