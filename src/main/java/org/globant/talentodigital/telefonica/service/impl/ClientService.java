package org.globant.talentodigital.telefonica.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.globant.talentodigital.telefonica.model.Client;
import org.globant.talentodigital.telefonica.model.Contract;
import org.globant.talentodigital.telefonica.repository.ClientRepository;
import org.globant.talentodigital.telefonica.repository.ContractRepository;
import org.globant.talentodigital.telefonica.service.IClientService;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@Service
public class ClientService implements IClientService {

    private final ClientRepository clientRepository;
    private final ContractRepository contractRepository;

    @Override
    public List<Client> findAllClients() {
        try {
            return clientRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deactivateAllContractsByClient(Long clientId) throws NoResourceFoundException {
        List<Contract> contracts = contractRepository.findAllByClientId(clientId);

        if (contracts.isEmpty()) {
            throw  new NoResourceFoundException(HttpMethod.GET, "Client not found");
        }

        for (Contract contract : contracts) {
            contract.setActive(false);
        }

        contractRepository.saveAll(contracts);


    }


    @Override
    public List<Client> findClientByPlan() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> findClientById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public boolean existsById(Long clientId) {
        return clientRepository.existsById(clientId);
    }

    @Override
    public Optional<Client> findById(Long clientId) {
        return clientRepository.findById(clientId);
    }

    @Transactional
    @ResponseStatus(HttpStatus.CREATED)
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }
}
