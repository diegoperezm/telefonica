package org.globant.talentodigital.telefonica.repository;

import org.globant.talentodigital.telefonica.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    public Client findById(long id);
}
