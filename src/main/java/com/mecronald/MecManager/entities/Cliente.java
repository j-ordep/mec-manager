package com.mecronald.MecManager.entities;

import com.mecronald.MecManager.dto.CarroDTO;
import com.mecronald.MecManager.dto.ClienteDTO;
import jakarta.persistence.*;
import lombok.*;


import java.util.*;

@Entity
@Table(name = "tb_cliente")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private int numero;
    private String email;

    // Cria um objeto DTO a partir do objeto atual
    public ClienteDTO toDTO() {
        return new ClienteDTO(this);          // ClienteDTO clienteDTO = cliente.toDTO();
    }



}
