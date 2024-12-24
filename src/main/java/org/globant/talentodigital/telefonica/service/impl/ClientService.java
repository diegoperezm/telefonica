package org.globant.talentodigital.telefonica.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.globant.talentodigital.telefonica.model.Client;
import org.globant.talentodigital.telefonica.repository.ClientRepository;
import org.globant.talentodigital.telefonica.service.IClientService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@Service
public class ClientService implements IClientService {

    private final ClientRepository clientRepository;

    @Override
    public List<Client> findAllClients() {
        try {
            return clientRepository.findAll();
        } catch (Exception e) {
          throw e;
        }
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
