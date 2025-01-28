package com.mecronald.MecManager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Table(name = "tb_ClienteCarro")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteCarroRelacao  {

    @EmbeddedId
    private ClienteCarroRelacaoPK id = new ClienteCarroRelacaoPK();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteCarroRelacao that = (ClienteCarroRelacao) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
