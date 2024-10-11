package com.hospital.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Historia_Clinica")
@Data


public class Historia_Clinica {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "fk_persona")
    private Long fk_persona;
    @Column(name = "fk_profesional")
    private Long fk_profesional;
    @Column(name = "fk_diagnostico")
    private Long fk_diagnostico;
    @Column(name = "fecha_creacion")
    private Date fecha_creacion;
    @Column(name = "fk_centro_atencion")
    private Long fk_centro_atencion;
    @Column(name = "estado_sistema")
    private Boolean estado_sistema;

}
