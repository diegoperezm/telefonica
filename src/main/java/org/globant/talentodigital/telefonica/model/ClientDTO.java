package org.globant.talentodigital.telefonica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientDTO {
    private String firstName;
    private String lastName;
    private String run;
    private Address address;
}
