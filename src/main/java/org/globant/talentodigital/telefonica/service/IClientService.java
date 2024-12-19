package org.globant.talentodigital.telefonica.service;

import org.globant.talentodigital.telefonica.model.Client;

import java.util.List;
import java.util.Optional;

public interface IClientService {

    public List<Client> findAllClients();

    public List<Client> findClientByPlan();

    public Optional<Client> findClientById(Long id);

    boolean existsById(Long clientId);

    Optional<Object> findById(Long clientId);
}
