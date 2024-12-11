package org.globant.talentodigital.telefonica.repository;

import org.globant.talentodigital.telefonica.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends JpaRepository<Plan, Long> {
}
