package org.globant.talentodigital.telefonica.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.globant.talentodigital.telefonica.model.Address;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientDTO {
    private String firstName;
    private String lastName;
    private String run;
    private Address address;
}
