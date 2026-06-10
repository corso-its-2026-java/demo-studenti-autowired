package com.its.demostudentiautowired.controller;

import com.its.demostudentiautowired.entity.Studente;
import com.its.demostudentiautowired.service.StudenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //VIENE UTILIZZATO QUANDO DEVI SALVARE UN NUOVO OGGETTO CON IL REQUEST BODY
        @PostMapping("/salva-studente")
    //STRING PERCHE' DOPO IL CONTROLLO DEVE RESTITUIRMI UNM MESSAGGIO CHE PRENDE NEL ServiceImpl
    public String create (@RequestBody Studente studente) {
        return studenteService.create(studente);
    }
}
