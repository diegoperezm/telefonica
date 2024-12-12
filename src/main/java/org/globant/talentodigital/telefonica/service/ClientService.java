package org.globant.talentodigital.telefonica.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.globant.talentodigital.telefonica.model.Client;
import org.globant.talentodigital.telefonica.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class ClientService implements IClientService{

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
    public Client findClientById(int id) {
        return null;
    }

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }
}
