package com.hospital.controller;


import com.hospital.entities.Persona;
import com.hospital.services.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "v1/person")
@RequiredArgsConstructor
public class PersonaRestController {

    private final PersonaService personaService;

    @GetMapping (name = "/list")
    public ResponseEntity<List<Persona>>  listPersonsApi(){

        List<Persona> personaList = personaService.getListPersons();
        return new ResponseEntity<>(personaList, HttpStatus.ACCEPTED);

    }

}
