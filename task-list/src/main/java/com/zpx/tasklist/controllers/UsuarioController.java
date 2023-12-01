package com.zpx.tasklist.controllers;

import com.zpx.tasklist.models.Usuario;
import com.zpx.tasklist.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> findAll () {
        return usuarioRepository.findAll();
    }

    @PostMapping
    public Usuario createUsuario (@RequestBody Usuario obj) {
        return usuarioRepository.save(obj);
    }
}
