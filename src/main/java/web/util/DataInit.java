package web.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.User;
import web.service.UserService;
import javax.annotation.PostConstruct;

@Component
public class DataInit {
    @Autowired
    private UserService userService;

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