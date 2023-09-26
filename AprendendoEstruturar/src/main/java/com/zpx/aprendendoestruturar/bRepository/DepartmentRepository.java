package com.zpx.aprendendoestruturar.bRepository;

import com.zpx.aprendendoestruturar.aModels.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
