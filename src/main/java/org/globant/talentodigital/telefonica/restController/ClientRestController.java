package org.globant.talentodigital.telefonica.restController;

import lombok.AllArgsConstructor;
import org.globant.talentodigital.telefonica.dto.ClientDTO;
import org.globant.talentodigital.telefonica.dto.ClientWithPlansDTO;
import org.globant.talentodigital.telefonica.mapper.ClientMapper;
import org.globant.talentodigital.telefonica.mapper.ClientWithPlansMapper;
import org.globant.talentodigital.telefonica.model.Client;
import org.globant.talentodigital.telefonica.model.Contract;
import org.globant.talentodigital.telefonica.model.Plan;
import org.globant.talentodigital.telefonica.service.IClientService;
import org.globant.talentodigital.telefonica.service.IContractService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@AllArgsConstructor
@RestController
@RequestMapping("/api/clients")
public class ClientRestController {
    private final IClientService clientService;
    private final IContractService contractService;

    @GetMapping("/")
    public ResponseEntity<List<ClientDTO>> getAllClients() {
        List<ClientDTO> clients = clientService
                .findAllClients()
                .stream().map(ClientMapper::toDto).collect(toList());

        if (clients.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(clients);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ClientWithPlansDTO> getClientPlans(@PathVariable("id") Long id) {

        Optional<Client> optionalClient = clientService.findClientById(id);
        List<Contract> contracts = contractService.findAllByClientId(id);
        List<Plan> plans = new ArrayList<>();

        for (Contract contract : contracts) {
            if (contract.getPlan() != null) {
                plans.add(contract.getPlan());
            }
        }

        if (optionalClient.isPresent()) {
            ClientWithPlansDTO clientWithPlansDTO = ClientWithPlansMapper
                                                     .toDto(optionalClient.get(), plans);
            return ResponseEntity.ok(clientWithPlansDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping("/create")
    public ResponseEntity<Void> createClient(@RequestBody Client client) {
        clientService.createClient(client);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PatchMapping("/deactivate/{id}")
    public ResponseEntity<Void> deactivateClient(@PathVariable("id") Long id) throws NoResourceFoundException {
        clientService.deactivateAllContractsByClient(id);
        return ResponseEntity.noContent().build();
    }

}
