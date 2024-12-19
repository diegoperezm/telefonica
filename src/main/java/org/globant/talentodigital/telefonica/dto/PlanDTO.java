package org.globant.talentodigital.telefonica.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlanDTO {
    private String planName;
    private BigDecimal price;
}
