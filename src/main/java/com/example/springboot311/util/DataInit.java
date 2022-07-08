package com.example.springboot311.util;

import org.springframework.stereotype.Component;
import com.example.springboot311.model.User;
import com.example.springboot311.service.UserService;
import javax.annotation.PostConstruct;

@Component
public class DataInit {
    private final UserService userService;

    public DataInit(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void createUsersTable() {
        userService.save(new User("John", "Doe", 23, "New York"));
        userService.save(new User("Jane", "Doe", 28, "New Jersey"));
        userService.save(new User("Jake", "Doe", 21, "Austin"));
        userService.save(new User("Jim", "Doe", 22, "New Orleans"));
        userService.save(new User("Joe", "Doe", 39, "Raleigh"));
        userService.save(new User("Jim", "Doe", 19, "Oklahoma City"));
    }
}