package org.example.lab5_20211688.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "viajes")
public class Viajes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idViajes", nullable = false)
    private Integer idViajes;

    @Column(name = "punto_recojo", length = 45)
    private String punto_recojo;
    @Column(name = "cant_personas", length = 45)
    private String cant_personas;
    @Column(name = "cant_perros",length = 45)
    private String cant_perros;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "persona_idPersona", nullable = false)
    private Persona idPersona;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "lugares_idLugares", nullable = false)
    private Lugares idLugares;
}
