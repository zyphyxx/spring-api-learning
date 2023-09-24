package com.zpx.aprendendoestruturar.dControllers;

import com.zpx.aprendendoestruturar.aModels.User;
import com.zpx.aprendendoestruturar.cServices.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserServices userServices;

    @GetMapping
    public List<User> getAllUser(){
        return userServices.getAllUser();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id){
        return userServices.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userServices.createUser(user);
    }





}
