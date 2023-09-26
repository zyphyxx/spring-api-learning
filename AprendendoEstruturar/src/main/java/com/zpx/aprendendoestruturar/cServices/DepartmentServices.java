package com.zpx.aprendendoestruturar.cServices;


import com.zpx.aprendendoestruturar.aModels.Department;
import com.zpx.aprendendoestruturar.bRepository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServices {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department createDepart(Department department){
       return departmentRepository.save(department);
    }


}
