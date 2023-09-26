package com.zpx.aprendendoestruturar.dControllers;

import com.zpx.aprendendoestruturar.aModels.Department;
import com.zpx.aprendendoestruturar.cServices.DepartmentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentServices departmentServices;

    @PostMapping("/department")
    public Department createDepart(@RequestBody Department department){
        return departmentServices.createDepart(department);
    }


}
