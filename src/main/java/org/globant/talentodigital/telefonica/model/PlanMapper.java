package org.globant.talentodigital.telefonica.model;

import java.math.BigDecimal;

public class PlanMapper {

    public static PlanDTO toDto(Plan plan) {
        String planName = plan.getPlanName();
        BigDecimal price = plan.getPrice();

        return new PlanDTO(planName, price);
    }
}
