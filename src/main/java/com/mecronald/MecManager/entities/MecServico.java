package com.mecronald.MecManager.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


// Ainda não sei se serviço tera uma entidade própria, mas provavelmente sim

@Entity
@Table(name = "tb_servico")
@Data
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
