package com.corejavaproject.jdbc;

import lombok.extern.log4j.Log4j2;
import java.time.LocalDate; // Make sure to import this!

@Log4j2
public class Main {
    public static void main(String[] args) {


        User user = new User("Shashank", "Kumar", "natalia@gmail.com", LocalDate.of(2026, 9, 27));

        User  user1 =new User("Sharath","Kumbar","email", LocalDate.of(2026, 9, 27));

        UserDAO userDAO = new UserDAOImpl();
        int result = userDAO.save(user);


        UserDAO userDAO1 = new UserDAOImpl();
        int result1 = userDAO1.save(user1);

        log.info("Result of saving user: {}", result);
        log.info("Result of saving user1: {}", result1);


        log.info("Current users in database: {}", userDAO.getAllUsers());
    }
}