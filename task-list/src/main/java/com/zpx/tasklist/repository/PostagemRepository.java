package com.zpx.tasklist.repository;

import com.zpx.tasklist.models.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository <Postagem , Long> {
}
