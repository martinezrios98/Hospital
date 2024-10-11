package com.hospital.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Centros_Atencion")


public class Centros_Atencion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nit")
    private String nit;
    @Column(name = "razon_social")
    private String fk_persona;
    @Column(name = "estado_sistema")
    private Boolean estado_sistema;


    public Centros_Atencion() {
    }

    public Centros_Atencion(Long id, String nit, String fk_persona, Boolean estado_sistema) {
        this.id = id;
        this.nit = nit;
        this.fk_persona = fk_persona;
        this.estado_sistema = estado_sistema;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getFk_persona() {
        return fk_persona;
    }

    public void setFk_persona(String fk_persona) {
        this.fk_persona = fk_persona;
    }

    public Boolean getEstado_sistema() {
        return estado_sistema;
    }

    public void setEstado_sistema(Boolean estado_sistema) {
        this.estado_sistema = estado_sistema;
    }
}


