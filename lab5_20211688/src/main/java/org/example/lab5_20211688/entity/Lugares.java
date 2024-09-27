package org.example.lab5_20211688.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "lugares")
public class Lugares {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLugares", nullable = false)
    private Integer idLugares;

    @Column(name = "nombre_lugar", length = 45)
    private String nombre_lugar;
    @Column(name = "descrip_lugar", length = 45)
    private String descrip_lugar;
    @Column(name = "fecha_lugar", length = 45)
    private String fecha_lugar;

}
