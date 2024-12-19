package org.globant.talentodigital.telefonica.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.globant.talentodigital.telefonica.model.Address;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientWithPlansDTO {
    private String firstName;
    private String lastName;
    private String run;
    private Address address;
    private List<PlanDTO> plans;

}
