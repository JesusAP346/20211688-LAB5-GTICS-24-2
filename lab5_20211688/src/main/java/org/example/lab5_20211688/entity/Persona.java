package org.example.lab5_20211688.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona", nullable = false)
    private Integer idPersona;

    @Column(name = "nombre", length = 45)
    private String nombre;
    @Column(name = "dni", length = 45)
    private String dni;
    @Column(name = "celular", length = 45)
    private String celular;
    @Column(name = "tipo_persona", length = 45)
    private String tipo_persona;
}
