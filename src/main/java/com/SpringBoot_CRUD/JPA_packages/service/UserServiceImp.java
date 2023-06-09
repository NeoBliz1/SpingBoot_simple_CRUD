package com.SpringBoot_CRUD.JPA_packages.service;

import com.SpringBoot_CRUD.JPA_packages.model.User;
import com.SpringBoot_CRUD.JPA_packages.DAO.UserDaoImp;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {

    private final UserDaoImp innerUserDaoImp;

    @Override
    public List<User> getUsersList() {
        log.info("UserWebServiceImpl: Users selected");
        return innerUserDaoImp.getUsersList();
    }

    @Transactional
    @Override
    public void addUserToDatabase(User formUser) {
        innerUserDaoImp.addUserToDatabase(formUser);
    }

    @Transactional
    @Override
    public void editUserData(User user) {
        log.info("userService start processing data");
        innerUserDaoImp.editUserData(user);
        log.info("userService finished processing data");
    }

    @Transactional
    @Override
    public void removeUserById(long id) throws IllegalArgumentException {
        innerUserDaoImp.removeUserById(id);
    }

}
