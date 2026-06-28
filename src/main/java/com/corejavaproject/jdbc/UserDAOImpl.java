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
        String sql = "insert into employees(first_name, last_name, email, hire_date) values (?, ?, ?, ?)";

        // Both the connection and the statement will close automatically now
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, user.firstName());
            statement.setString(2, user.lastName());
            statement.setString(3, user.email());

            // FIXED: Using setObject and your record's camelCase method hireDate()
            statement.setObject(4, user.hireDate());

            response = statement.executeUpdate();
        } catch (Exception ex) {
            // FIXED: Added 'ex' here so you can actually read the error details in your console
            log.error("Exception while saving the user details", ex);
        }
        log.info("Inserted the user details, no of rows inserted:{}", response);
        return response;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String sql = "select first_name, last_name, email, hire_date from employees";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");

                // Reading SQL DATE back out as a Java LocalDate cleanly
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