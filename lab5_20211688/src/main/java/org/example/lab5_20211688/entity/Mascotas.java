package org.example.lab5_20211688.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "mascotas")
public class Mascotas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMascotas", nullable = false)
    private Integer idMascotas;

    @Column(name = "nombre_mascota", length = 45)
    private String nombre_mascota;
    @Column(name = "genero", length = 45)
    private String genero;
    @Column(name = "edad", length = 45)
    private String edad;
    @Column(name = "fecha_nacimiento", length = 45)
    private String fecha_nacimiento;
    @Column(name = "vacunado", length = 45)
    private String vacunado;
    @Column(name = "desparacitado", length = 45)
    private String desparacitado;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "persona_idPersona", nullable = false)
    private Persona idPersona;
}
