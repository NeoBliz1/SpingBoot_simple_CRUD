package com.SpringBoot_CRUD.JPA_packages.initialization;

import com.SpringBoot_CRUD.JPA_packages.model.User;
import com.SpringBoot_CRUD.JPA_packages.service.UserService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class Init {

    private final UserService innerUserService;

    @PostConstruct
    public void init() {
        log.info("Init: start users adding");
        innerUserService.addUserToDatabase(new User("Andre", "Matias", "andreMatias@gmail.com"));
        innerUserService.addUserToDatabase(new User("Mari", "Lebron", "mariButterfly@gmail.com"));
        log.info("Init: finished users adding");
    }
}


