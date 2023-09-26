package com.zpx.aprendendoestruturar.fCollApp;

import com.zpx.aprendendoestruturar.aModels.Department;
import com.zpx.aprendendoestruturar.aModels.User;
import org.springframework.boot.CommandLineRunner;

public class chamaa implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
       User u1 = new User(null,"Ronaldo","ronaldo@gmail.com",new Department());

       Department d1 = new Department(null);




    }
}
