package com.mecronald.MecManager.dto;

import com.mecronald.MecManager.entities.Cliente;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class ClienteDTO {

    private Long id;
    private String nome;
    private String cpf;
    private int numero;
    private String email;

    public ClienteDTO(Cliente entity) {
        BeanUtils.copyProperties(entity, this); // mais simples que o constructor comum
    }

}
