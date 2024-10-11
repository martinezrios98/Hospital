package com.hospital.entities.repository;

import com.hospital.entities.Persona;
import org.hibernate.annotations.processing.Find;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona, Long> {


    @Query(value = "SELECT * FROM personas", nativeQuery = true)
    List<Persona> listPersons();

    @Override
    List<Persona> findAll();
}
