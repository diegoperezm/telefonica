package org.globant.talentodigital.telefonica.service;

import org.globant.talentodigital.telefonica.model.Contract;

import java.util.List;

public interface IContractService {
    public List<Contract> findAllByClientId(Long clientId);
     public void deactivateAllContractsByClient(Long ClienId);
}
