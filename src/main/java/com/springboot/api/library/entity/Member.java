package com.springboot.api.library.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "socios")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @NotEmpty
    @Column(name = "numero_socio", unique = true )
    private String memberShipNumber;

    @NotEmpty
    @Column(name = "nombre")
    private String name;

    @NotEmpty
    @Column(name = "nif", unique = true)
    private String nif;

    @Column(name = "fecha_de_nacimiento")
    private Date brithdayDate;

    @Column(name = "movil")
    private Integer mobile;

    @Column(name = "direccion")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "provincia")
    private String province;








 

}
