package com.mecronald.MecManager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "tb_servico")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MecServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String decricao;
    private double preco;
    private LocalDateTime horaDeEntrada;
    private LocalDateTime horaDeSaida;




}
