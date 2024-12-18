package org.globant.talentodigital.telefonica.service;

import org.globant.talentodigital.telefonica.repository.PlanRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PlanServiceTest {

    @InjectMocks
    private PlanService planService;
    @Mock
    private PlanRepository planRepository;

    @Test
    void findAllPlansTest() {
        when(planRepository.findAll())
                .thenReturn(List.of());

        var result = planService.findAllPlans();

        assertEquals(result.size(), 0);
    }


    @Test
    void getAll() {
        when(planRepository.findAll())
                .thenReturn(List.of());

        var result = planService.findAllPlans();

        assertEquals(result.size(), 0);

    }
}