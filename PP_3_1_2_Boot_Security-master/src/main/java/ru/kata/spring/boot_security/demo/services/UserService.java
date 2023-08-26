package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {
    public User findByUsername(String username);

    public void saveUser(User user);

    public List<User> getAllUsers();

    public User showUserById(int id);

    public void updateUserById(int id, User updateUser);

    public void deleteUserById(int id);
}
