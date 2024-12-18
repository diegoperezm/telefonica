package org.globant.talentodigital.telefonica.model;

import java.util.ArrayList;
import java.util.List;

public class ClientWithPlansMapper {

    public static ClientWithPlansDTO toDto(Client client, List<Plan> plans) {
        String firstName = client.getFirstName();
        String lastName = client.getLastName();
        String run = client.getRun();
        Address address = client.getAddress();

        List<PlanDTO> plansDTO = new ArrayList<>();

        for (Plan plan : plans) {
            if (plan.getPlanName() != null) {
                plansDTO.add(new PlanDTO(plan.getPlanName(), plan.getPrice()));
            }
        }

        return new ClientWithPlansDTO(firstName, lastName, run, address, plansDTO);
    }
}
