package com.example.task_4_main.services;

import com.example.task_4_main.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<User> users = new ArrayList<>();
    private Long ID = 0L;
    {
        users.add(new User(++ID, "Yan", "Zuev"));
        users.add(new User(++ID, "Ivan", "Shuev"));
    }

    public List<User> listUsers() {
        return users;
    }

    public void addUser (User user) {
        user.setId(++ID);
        users.add(user);
    }

    public void replaceUser (Long id, User user) {
        deleteUser(id);
        user.setId(id);
        users.add(user);
    }


    public void deleteUser (Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }

    public User getUserById(Long id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
