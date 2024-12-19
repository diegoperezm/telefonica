package org.globant.talentodigital.telefonica.service.impl;

import lombok.AllArgsConstructor;
import org.globant.talentodigital.telefonica.model.Contract;
import org.globant.talentodigital.telefonica.repository.ContractRepository;
import org.globant.talentodigital.telefonica.service.IContractService;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ContractService implements IContractService {

    private final ContractRepository  contractRepository;

    @Override
    public List<Contract> findAllByClientId(Long clientId) {
        return contractRepository.findAllByClientId(clientId);
    }

    @Override
    public void deactivateAllContractsByClient(Long clientId) {
        List<Contract> contracts = contractRepository.findAllByClientId(clientId);

        for (Contract contract : contracts) {
            contract.setActive(false);
        }
        contractRepository.saveAll(contracts);
    }

    public List<Contract> findAlL() {
        return contractRepository.findAll();
    }
}
