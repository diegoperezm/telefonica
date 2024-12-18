package org.globant.talentodigital.telefonica.repository;

import org.globant.talentodigital.telefonica.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContractRepository extends JpaRepository<Contract, Long> {
    List<Contract> findAllByClientId(Long clientId);

}
