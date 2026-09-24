package com.aula.agendamento_odontologico.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

    @Table(name = "dentista")
    @Entity(name = "Dentista")
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
//Compara id entre objeto e tabela
    @EqualsAndHashCode(of = "id")
    public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;
}
