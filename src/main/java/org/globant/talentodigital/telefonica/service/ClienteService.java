package org.globant.talentodigital.telefonica.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.globant.talentodigital.telefonica.model.Cliente;
import org.globant.talentodigital.telefonica.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class ClienteService implements IClienteService{

    private final ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAllCliente() {
        return clienteRepository.findAll();
    }
}
