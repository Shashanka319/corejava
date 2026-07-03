package com.corejavaproject.jdbc;

import lombok.extern.log4j.Log4j2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class UserDAOImpl implements UserDAO {

    @Override
    public int save(User user) {
        int response = 0;
        String sql = "INSERT INTO employees(first_name, last_name, email, hire_date) VALUES (?, ?, ?, ?)";

        // FIX: Call your custom DBConnections helper here
        try (Connection connection = DBConnections.getEmployeeConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            if (connection == null) {
                log.error("Could not establish a database connection.");
                return 0;
            }

            statement.setString(1, user.firstName());
            statement.setString(2, user.lastName());
            statement.setString(3, user.email());
            statement.setObject(4, user.hireDate());

            response = statement.executeUpdate();
        } catch (Exception ex) {
            log.error("Exception while saving the user details", ex);
        }
        log.info("Inserted the user details, no of rows inserted: {}", response);
        return response;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT first_name, last_name, email, hire_date FROM employees";

        // FIX: Call your custom DBConnections helper here
        try (Connection connection = DBConnections.getEmployeeConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            if (connection == null) {
                log.error("Could not establish a database connection.");
                return users;
            }

            while (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                LocalDate hireDate = resultSet.getObject("hire_date", LocalDate.class);

                User user = new User(firstName, lastName, email, hireDate);
                users.add(user);
            }
        } catch (Exception ex) {
            log.error("Exception while fetching all users", ex);
        }
        return users;
    }
}