package com.hospital.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity/* Persistencia */
@Table(name = "Personas")/* Persistencia */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "fk_tipo_documento", referencedColumnName = "id")
    private Tipo_documento fk_tipo_documento;






}
