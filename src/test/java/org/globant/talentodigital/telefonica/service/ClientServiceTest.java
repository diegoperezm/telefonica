package org.globant.talentodigital.telefonica.service;

import org.globant.talentodigital.telefonica.model.Client;
import org.globant.talentodigital.telefonica.repository.ClientRepository;
import org.globant.talentodigital.telefonica.service.impl.ClientService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;


public class ClientServiceTest {

    @Mock
    private ClientRepository clientRepository;

    @InjectMocks
    private ClientService clientService;

    private Client client;

    @BeforeEach
    public void setUp() {
//        MockitoAnnotations.openMocks(this);
        client = new Client();
        client.setId(1L);
        client.setFirstName("Juan");
        client.setLastName("Perez");
        client.setRun("123456789-9");
    }

    @Test
    public void testCrearClient() {
        when(clientRepository.save(any(Client.class))).thenReturn(client);

        Client result = clientService.createClient(client);

        assertNotNull(result);
        assertEquals("JuanN", result.getFirstName());
        verify(clientRepository, times(1)).save(client);
   }

}



