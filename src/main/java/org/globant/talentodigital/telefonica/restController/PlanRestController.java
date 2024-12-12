package org.globant.talentodigital.telefonica.restController;

import lombok.RequiredArgsConstructor;
import org.globant.talentodigital.telefonica.model.PlanDTO;
import org.globant.talentodigital.telefonica.model.PlanMapper;
import org.globant.talentodigital.telefonica.service.PlanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PlanRestController {

    private final PlanService planService;

    @GetMapping("/clients")
    public ResponseEntity<List<PlanDTO>> getAllPlans() {
        List<PlanDTO> clients = planService
                .findAllPlans()
                .stream().map(PlanMapper::toDto).collect(toList());

        return ResponseEntity.ok(clients);
    }
}
