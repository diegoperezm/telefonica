package org.globant.talentodigital.telefonica.service;

import org.globant.talentodigital.telefonica.model.Plan;
import org.globant.talentodigital.telefonica.repository.PlanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanService implements  IPlanService{

   private PlanRepository planRepository;

    @Override
    public List<Plan> findAllPlans() {
        return planRepository.findAll();
    }
}
