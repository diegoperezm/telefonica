package org.globant.talentodigital.telefonica.model;

public class ClientMapper {

    public static ClientDTO toDto(Client client) {
        String firstName = client.getFirstName();
        String lastName  = client.getLastName();
        String run       = client.getRun();
        Address address   = client.getAddress();

        return new ClientDTO(firstName, lastName, run, address);
    }
}
