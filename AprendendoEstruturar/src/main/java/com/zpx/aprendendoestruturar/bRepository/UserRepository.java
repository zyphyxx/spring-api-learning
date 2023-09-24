package com.zpx.aprendendoestruturar.bRepository;

import com.zpx.aprendendoestruturar.aModels.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {




}
