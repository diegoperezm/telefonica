package org.globant.talentodigital.telefonica.restController;

import lombok.RequiredArgsConstructor;
import org.globant.talentodigital.telefonica.model.Contract;
import org.globant.talentodigital.telefonica.service.impl.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/contracts")
public class ContractRestController {

    @Autowired
    private final ContractService contractService;

    @GetMapping
    public ResponseEntity<List<Contract>> findAll() {
        List<Contract> contracts = contractService.findAlL();
      return  ResponseEntity.ok(contracts);
    }




}
