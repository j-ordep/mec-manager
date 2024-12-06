package com.mecronald.MecManager.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    int cpf;
    int numero;
    String email;
    String carro;
}
