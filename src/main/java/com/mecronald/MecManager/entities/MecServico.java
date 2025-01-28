package com.mecronald.MecManager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


// Ainda não sei se serviço tera uma entidade própria, mas provavelmente sim

@Entity
@Table(name = "tb_servico")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MecServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String decricao;
    private double preco;
    private LocalDateTime horaDeEntrada;
    private LocalDateTime horaDeSaida;



}
