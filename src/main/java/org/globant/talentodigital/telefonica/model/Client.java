package org.globant.talentodigital.telefonica.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.CustomLog;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "client")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name = "nombre")
    private String firstName;

    //@Column(name = "apellido")
    private String lastName;

    //@Column(name = "run")
    private String run;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_address")
    private Address address;

    //@Column(name = "fecha_nacimiento")
    private LocalDate dateOfBirth;

}







