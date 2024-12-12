package org.globant.talentodigital.telefonica.service;

import org.globant.talentodigital.telefonica.model.Client;

import java.util.Arrays;
import java.util.List;

public interface IClientService {

    public List<Client> findAllClient();
    public List<Client> findClientByPlan();
    public Client  findClientById(int id);
}