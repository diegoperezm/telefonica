package org.globant.talentodigital.telefonica.restController;

import lombok.RequiredArgsConstructor;
import org.globant.talentodigital.telefonica.model.Client;
import org.globant.talentodigital.telefonica.model.ClientDTO;
import org.globant.talentodigital.telefonica.model.ClientMapper;
import org.globant.talentodigital.telefonica.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ClientRestController {

    private final ClientService clientService;

    @GetMapping("/clients")
    public ResponseEntity<List<ClientDTO>> getAllClients() {
        List<ClientDTO> clients = clientService
                .findAllClient()
                .stream().map(ClientMapper::toDto).collect(toList());

        return ResponseEntity.ok(clients);
    }

    @GetMapping("/clients/{id}")
    public ResponseEntity<ClientDTO> getClientPlan(@PathVariable("id") int id) {
        ClientDTO client = ClientMapper
                            .toDto(clientService.findClientById(id));
        return ResponseEntity.ok(client);
    }






}
