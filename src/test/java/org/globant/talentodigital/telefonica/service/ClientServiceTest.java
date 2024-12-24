package org.globant.talentodigital.telefonica.service;

import org.globant.talentodigital.telefonica.model.Client;
import org.globant.talentodigital.telefonica.repository.ClientRepository;
import org.globant.talentodigital.telefonica.service.impl.ClientService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ClientServiceTest {

    @Mock
    private ClientRepository clientRepository;

    @InjectMocks
    private ClientService clientService;
    private Client client_1;
    private Client client_2;

    @BeforeEach
    public void setUp() {
        client_1 = new Client();
        client_1.setId(1L);
        client_1.setFirstName("Juan");
        client_1.setLastName("Perez");
        client_1.setRun("123456789-9");

        client_2 = new Client();
        client_2.setId(2L);
        client_2.setFirstName("Ramon");
        client_2.setLastName("Estevez");
        client_2.setRun("133456789-9");
    }

    @Test
    void createClient_Null() {
        when(clientRepository.save(null)).thenReturn(null);
        Client result = clientService.createClient(null);
        assertNull(result);
    }

    @Test
    void createClient_NotNull() {
        when(clientRepository.save(any(Client.class))).thenReturn(client_1);
        Client result = clientService.createClient(client_1);
        assertNotNull(result);
    }

}



