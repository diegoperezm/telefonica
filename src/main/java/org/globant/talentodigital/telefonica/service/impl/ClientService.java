package org.globant.talentodigital.telefonica.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.globant.talentodigital.telefonica.model.Client;
import org.globant.talentodigital.telefonica.repository.ClientRepository;
import org.globant.talentodigital.telefonica.service.IClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@Service
public class ClientService implements IClientService {

    private final ClientRepository clientRepository;

    @Override
    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public List<Client> findClientByPlan() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> findClientById(Long id) {
        return clientRepository.findById(id);
    }

    @Transactional
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }
}
