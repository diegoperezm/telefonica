package org.globant.talentodigital.telefonica.repository;

import org.globant.talentodigital.telefonica.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
