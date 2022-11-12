package org.example.springcourse.SpringBootCRUD.service;


import org.example.springcourse.SpringBootCRUD.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public User getUser(int id);

    public void save(User user);

    public void updateUser(int id, User user);

    public void deleteUser(int id);
}
