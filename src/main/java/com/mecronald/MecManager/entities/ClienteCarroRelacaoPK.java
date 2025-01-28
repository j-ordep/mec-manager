package com.mecronald.MecManager.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class ClienteCarroRelacaoPK {

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente = new Cliente();

    @ManyToOne
    @JoinColumn(name = "carro_id")
    private Carro carro = new Carro();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteCarroRelacaoPK that = (ClienteCarroRelacaoPK) o;
        return Objects.equals(cliente, that.cliente) && Objects.equals(carro, that.carro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente, carro);
    }
}
