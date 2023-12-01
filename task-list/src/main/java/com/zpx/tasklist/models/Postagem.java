package com.zpx.tasklist.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "postagens")
@Data
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String comentario;

    private String categoria;
}
