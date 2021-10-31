package com.chern.serverapplication.electrostoreserver.controller;

import com.chern.serverapplication.electrostoreserver.model.User;
import com.chern.serverapplication.electrostoreserver.model.UserStatus;
import com.chern.serverapplication.electrostoreserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public UserStatus login(@RequestBody User user){
        return userService.loginUser(user);
    }

    @PostMapping("/register")
    public boolean register(@RequestBody User user){
        return userService.registerUser(user);
    }
}
