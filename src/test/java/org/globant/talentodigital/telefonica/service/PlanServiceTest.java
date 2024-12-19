package org.globant.talentodigital.telefonica.service;

import org.globant.talentodigital.telefonica.model.Plan;
import org.globant.talentodigital.telefonica.model.ServiceType;
import org.globant.talentodigital.telefonica.repository.PlanRepository;
import org.globant.talentodigital.telefonica.service.impl.PlanService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.List;

import static org.globant.talentodigital.telefonica.model.ServiceType.INTERNET;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PlanServiceTest {

    @InjectMocks
    private PlanService planService;
    @Mock
    private PlanRepository planRepository;

    @Test
    void findAllPlans_Empty_List_Test() {
        when(planRepository.findAll())
                .thenReturn(List.of());

        var result = planService.findAllPlans();

        assertEquals(result.size(), 0);
    }


    @Test
    void findAllPlans_With_Plans_Test() {
        var plan1 = new Plan();
        plan1.setId(1L);
        plan1.setPlanName("Plan A");
        plan1.setPrice(new BigDecimal("29.99"));
        plan1.setServiceType(ServiceType.TELEVISION);

        var plan2 = new Plan();
        plan2.setId(2L);
        plan2.setPlanName("Plan B");
        plan2.setPrice(new BigDecimal("49.99"));
        plan2.setServiceType(INTERNET);

        var plans = List.of(plan1, plan2);

        when(planRepository.findAll()).thenReturn(plans);
        var result = planService.findAllPlans();

        assertEquals(2, result.size());
        assertEquals(plans, result);
    }



}