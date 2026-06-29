package com.corejavaproject.jdbc;

import java.util.List;

public interface UserDAO {
    int save(User user);
    List<User> getAllUsers();

}
