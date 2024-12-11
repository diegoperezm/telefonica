package org.globant.talentodigital.telefonica.restController;

import lombok.RequiredArgsConstructor;
import org.globant.talentodigital.telefonica.model.Cliente;
import org.globant.talentodigital.telefonica.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ClientRestController {

    private final ClienteService clienteService;

    @GetMapping("/clients")
    public ResponseEntity<Cliente> getAllClients() {
        List<Cliente> clients = clienteService.findAllCliente();
        return ResponseEntity.ok((Cliente) clients);
    }
}
