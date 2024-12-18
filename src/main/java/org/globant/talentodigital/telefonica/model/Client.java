package org.globant.talentodigital.telefonica.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "client")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String run;

    private LocalDate dateOfBirth;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Address address;

}








