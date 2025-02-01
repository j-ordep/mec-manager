package com.mecronald.MecManager.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "tb_ClienteCarro")
@Entity
@Data
@NoArgsConstructor
public class RelacaoClienteCarro {

    @EmbeddedId
    private RelacaoClienteCarroPK id = new RelacaoClienteCarroPK();

    RelacaoClienteCarro(Cliente cliente, Carro carro) {
        id.setCliente(cliente);
        id.setCarro(carro);
    }

    RelacaoClienteCarroPK getId() {
        return id;
    }

    public void setId(RelacaoClienteCarroPK id) {
        this.id = id;
    }


}
