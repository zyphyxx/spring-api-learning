package com.zpx.tasklist.controllers;

import com.zpx.tasklist.models.Postagem;
import com.zpx.tasklist.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("postagem")
public class PostagemController {

    @Autowired
    private PostagemRepository postagemRepository;

    @PostMapping
    public Postagem createPostagem (@RequestBody Postagem obj) {
        return postagemRepository.save(obj);
    }

    @GetMapping
    public List<Postagem> findAll () {
        return postagemRepository.findAll();
    }

}
