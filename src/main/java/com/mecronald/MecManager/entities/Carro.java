package com.mecronald.MecManager.entities;

import com.mecronald.MecManager.dto.CarroDTO;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "tb_carro")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placa;
    private String modelo;
    private int ano;
    private String cor;

    // Cria um objeto DTO a partir do objeto atual
    public CarroDTO toDTO() { // TODO transformar em interface
        return new CarroDTO(this);
    }



}

