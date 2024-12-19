package org.globant.talentodigital.telefonica.restController;

import lombok.RequiredArgsConstructor;
import org.globant.talentodigital.telefonica.model.Plan;
import org.globant.talentodigital.telefonica.dto.PlanDTO;
import org.globant.talentodigital.telefonica.mapper.PlanMapper;
import org.globant.talentodigital.telefonica.service.impl.PlanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/plans")
public class PlanRestController {

    private final PlanService planService;

    @GetMapping()
    public ResponseEntity<List<PlanDTO>> getAllPlans() {
        List<PlanDTO> plans = planService
                .findAllPlans()
                .stream().map(PlanMapper::toDto).collect(toList());

        return ResponseEntity.ok(plans);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> createPlan(@RequestBody Plan plan) {
        planService.createPlan(plan);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
