package com.example.springboot311.dao;

import com.example.springboot311.model.User;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(long id);
    void save(User user);
    void update(long id, User updatedUser);
    void delete(long id);
}