package com.hospital.services;

import com.hospital.services.service.PersonaService;
import com.hospital.entities.Persona;
import com.hospital.entities.repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PersonaServiceImplement implements PersonaService {


   private final PersonaRepository personaRepository;



    @Override
    public List<Persona> getListPersons() {

        return personaRepository.listPersons();

    }
}
