package com.chern.serverapplication.electrostoreserver;

import com.chern.serverapplication.electrostoreserver.model.Role;
import com.chern.serverapplication.electrostoreserver.model.User;
import com.chern.serverapplication.electrostoreserver.repository.UserRepo;
import org.aspectj.lang.annotation.Before;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.NoSuchElementException;
import java.util.Optional;

@SpringBootTest
public class ServerApplicationTests {

    @Autowired
    private UserRepo userRepo;
    private User user;

    @Test
    void contextLoads() {

    }

    @Test
    public void insertNewUserToDB(){
        user = new User("Ilya", "12345", Role.ADMIN);
        Assert.assertNotNull(userRepo.save(user));
    }

    @Test
    public void findUserByName(){
        Assert.assertNotNull(userRepo.findByUsername("Ilya"));
    }

    @Test
    public void deleteUserFromDB(){
        Optional<User> user = userRepo.findByUsername("Ilya");
        userRepo.deleteById(user.get().getId());
        Assert.assertThrows(NoSuchElementException.class, () -> {
            userRepo.findByUsername("Ilya").get();
        });
    }
}
