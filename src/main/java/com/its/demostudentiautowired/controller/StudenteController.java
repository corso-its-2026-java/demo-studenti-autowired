package com.its.demostudentiautowired.controller;

import com.its.demostudentiautowired.entity.Studente;
import com.its.demostudentiautowired.service.StudenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/studentecontroller")
public class StudenteController {

    //CON L'AUTOWIRED INIETTA TUTTO QUELLO CHE STA DENTRO L'INTERFACCIA CHE
    //A SUA VOLTA VIENE IMPLEMENTATA DAL SERIVE CHE IMPLEMENTERA' I METODI
    @Autowired
    private StudenteService studenteService;

    //CREAZIONE CONTROLLER COLLEGATO AL SERVICE(NUOVO PACKAGE + JAVACLASS (INTERFACE) PER IL SERVICE)
    @GetMapping("/elenco")
    public List<Studente> getAll(){
        return studenteService.getAll();
    }
}
