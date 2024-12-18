package org.globant.talentodigital.telefonica.restController;

import lombok.RequiredArgsConstructor;
import org.globant.talentodigital.telefonica.model.*;
import org.globant.talentodigital.telefonica.service.ClientService;
import org.globant.talentodigital.telefonica.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/clients")
public class ClientRestController {

    @Autowired
    private final ClientService clientService;

    @Autowired
    private final ContractService contractService;


    @PostMapping("/create")
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client savedClient = clientService.createClient(client);
        return new ResponseEntity<>(savedClient, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<ClientDTO>> getAllClients() {
        List<ClientDTO> clients = clientService
                .findAllClients()
                .stream().map(ClientMapper::toDto).collect(toList());

        return ResponseEntity.ok(clients);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ClientWithPlansDTO> getClientPlans(@PathVariable("id") Long id) {

        Optional<Client> optionalClient = clientService.findClientById(id);
        List<Contract> contracts = contractService.findAllByClientId(id);
        List<Plan> plans = new ArrayList<>();

        for (Contract contract : contracts) {
            if(contract.getPlan() != null) {
                plans.add(contract.getPlan());
            }
        }

        if (optionalClient.isPresent()) {
            ClientWithPlansDTO clientWithPlansDTO = ClientWithPlansMapper.toDto(optionalClient.get(), plans);
            return ResponseEntity.ok(clientWithPlansDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
