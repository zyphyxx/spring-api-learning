package com.zpx.aprendendoestruturar.fCollApp;

import com.zpx.aprendendoestruturar.aModels.Department;
import com.zpx.aprendendoestruturar.dControllers.DepartmentController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class collapp {

    @GetMapping("/")
    public String digaOla(){
        return "Ola mundo";
    }



}


