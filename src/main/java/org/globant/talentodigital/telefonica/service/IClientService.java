package org.globant.talentodigital.telefonica.service;

import org.globant.talentodigital.telefonica.model.Client;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.List;
import java.util.Optional;

public interface IClientService {

    List<Client> findAllClients();
    List<Client> findClientByPlan();
    Optional<Client> findClientById(Long id);
    boolean existsById(Long clientId);
    Optional<Client> findById(Long clientId);
    Client createClient(Client client);
    void deactivateAllContractsByClient(Long ClienId) throws NoResourceFoundException;
}
