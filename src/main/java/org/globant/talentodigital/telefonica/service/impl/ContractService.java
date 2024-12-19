package org.globant.talentodigital.telefonica.service.impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.globant.talentodigital.telefonica.model.Client;
import org.globant.talentodigital.telefonica.model.Contract;
import org.globant.talentodigital.telefonica.model.Plan;
import org.globant.talentodigital.telefonica.repository.ContractRepository;
import org.globant.talentodigital.telefonica.service.IContractService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Service
public class ContractService implements IContractService {

    private final ContractRepository contractRepository;
    private final ClientService clientService;
    private final PlanService planService;

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

    public void createContract(Long clientId, Long planId) {

        Client client =  clientService.findClientById(clientId)
                .orElseThrow(() -> new EntityNotFoundException("Client with id " + clientId + " not found"));

        Plan plan = planService.findById(planId)
                .orElseThrow(() -> new EntityNotFoundException("Plan with id " + planId + " not found"));


        Contract contract = new Contract();
        contract.setClient(client);
        contract.setPlan(plan);
        contract.setStartDate(LocalDate.now());
        contract.setTerminationDate(null);
        contract.setActive(true);

        contractRepository.save(contract);
    }
}
