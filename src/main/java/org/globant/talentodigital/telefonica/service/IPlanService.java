package org.globant.talentodigital.telefonica.service;

import org.globant.talentodigital.telefonica.model.Plan;

import java.util.List;
import java.util.Optional;

public interface IPlanService {
  public List<Plan> findAllPlans();
  public Plan createPlan(Plan plan);

    boolean existsById(Long planId);

    Optional<Plan> findById(Long id);
}
