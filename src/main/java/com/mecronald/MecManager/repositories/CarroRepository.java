package com.mecronald.MecManager.repositories;

import com.mecronald.MecManager.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
