package org.globant.talentodigital.telefonica.service;

import lombok.AllArgsConstructor;
import org.globant.talentodigital.telefonica.model.Plan;
import org.globant.talentodigital.telefonica.repository.ClientRepository;
import org.globant.talentodigital.telefonica.repository.PlanRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class PlanService implements IPlanService{

    private final PlanRepository planRepository;


    @Override
    public List<Plan> findAllPlan() {
        return List.of();
    }
}
