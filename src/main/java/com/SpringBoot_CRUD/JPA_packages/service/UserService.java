package com.SpringBoot_CRUD.JPA_packages.service;

import com.SpringBoot_CRUD.JPA_packages.model.User;

import java.util.List;

public interface UserService {
    void addUserToDatabase(User user);
    void removeUserById(long id);
    void editUserData(User user);
    List<User> getUsersList();
}
