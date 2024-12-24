package org.globant.talentodigital.telefonica.service;

import org.globant.talentodigital.telefonica.model.Contract;

import java.util.List;

public interface IContractService {
    List<Contract> findAllByClientId(Long clientId);
    void createContract(Long clientId, Long planId);
}
