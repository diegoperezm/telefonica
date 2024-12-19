package org.globant.talentodigital.telefonica.service.impl;

import lombok.AllArgsConstructor;
import org.globant.talentodigital.telefonica.model.Plan;
import org.globant.talentodigital.telefonica.repository.PlanRepository;
import org.globant.talentodigital.telefonica.service.IPlanService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlanService implements IPlanService {

   private PlanRepository planRepository;

   // FIX getAllPlans ?
    @Override
    public List<Plan> findAllPlans() {
        return planRepository.findAll();
    }

    @Override
    public Plan createPlan(Plan plan) {
       return planRepository.save(plan);
    }

    @Override
    public boolean existsById(Long planId) {
        return planRepository.existsById(planId);
    }

    @Override
    public Optional<Plan> findById(Long id) {
        return planRepository.findById(id);
    }


}
