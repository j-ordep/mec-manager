package com.mecronald.MecManager.repositories;

import com.mecronald.MecManager.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
