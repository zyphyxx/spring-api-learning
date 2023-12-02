package com.zpx.tasklist.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table(name = "usuarios")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Postagem> postagem;

}
