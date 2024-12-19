package org.globant.talentodigital.telefonica.mapper;

import org.globant.talentodigital.telefonica.dto.PlanDTO;
import org.globant.talentodigital.telefonica.model.Plan;

import java.math.BigDecimal;

public class PlanMapper {

    public static PlanDTO toDto(Plan plan) {
        String planName = plan.getPlanName();
        BigDecimal price = plan.getPrice();

        return new PlanDTO(planName, price);
    }
}
