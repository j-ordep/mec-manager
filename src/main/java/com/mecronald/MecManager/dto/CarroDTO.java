package com.mecronald.MecManager.dto;

import com.mecronald.MecManager.entities.Carro;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class CarroDTO {

    private Long id;
    private String placa;
    private String modelo;
    private int ano;
    private String cor;

    public CarroDTO() {
    }

    public CarroDTO(Carro entity) {
        id = entity.getId();
        placa = entity.getPlaca();
        modelo = entity.getModelo();
        ano = entity.getAno();
        cor = entity.getCor();
    }
}
