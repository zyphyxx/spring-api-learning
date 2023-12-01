package com.zpx.tasklist.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "usuarios")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne
    @JoinColumn(name = "postagem_id",referencedColumnName = "id")
    private Postagem postagem;

}
