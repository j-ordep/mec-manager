package com.mecronald.MecManager.entities;

import com.mecronald.MecManager.dto.CarroDTO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CarroTest {


    @Test
    public void testToDTO() {

        Carro carro1 = new Carro(1L, "ABC1234", "Fusca", 1980, "azul");
        CarroDTO carro1DTO = carro1.toDTO();

        Carro carro2 = Carro.builder()
                .id(2L)
                .placa("DEF5678")
                .modelo("Fusca")
                .ano(1980)
                .cor("azul")
                .build();
        CarroDTO carro2DTO = carro2.toDTO();

        assertEquals(carro1.getId(), carro1DTO.getId());
        assertEquals(carro1.getPlaca(), carro1DTO.getPlaca());
        System.out.println("Carro1, placa: " + carro1DTO.getPlaca());

        assertEquals(carro2.getId(), carro2DTO.getId());
        assertEquals(carro2.getPlaca(), carro2DTO.getPlaca());
        System.out.println("Carro2, placa: " + carro2DTO.getPlaca());

        System.out.println("tudo ok");

    }

}