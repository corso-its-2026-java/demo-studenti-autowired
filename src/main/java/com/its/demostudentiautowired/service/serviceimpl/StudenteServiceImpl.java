package com.its.demostudentiautowired.service.serviceimpl;

import com.its.demostudentiautowired.entity.Studente;
import com.its.demostudentiautowired.service.StudenteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//SPECIFICA LA CLASSE:
@Service
//IMPLEMENTIAMO L'INTERFACCIA CHE CONTIENE LA FIRMA DEL METODO
public class StudenteServiceImpl implements StudenteService {

    //NEL <> SI INSERISCE LA CLASSE CHE SI RICHIAMA
    //SI USANO LE LISTE PERCHE' SONO PIU' POTENTI DEGLI ARRAY.
    public List<Studente> studenti = new ArrayList<>();
    //CREAZIONE OGGETTO CON IL COSTRUTTORE
    public StudenteServiceImpl() {
        Studente studente = new Studente();
        studente.setId(1);
        studente.setNome("Giusy");
        studente.setCorso("Spring-boot");
        studenti.add(studente);

        Studente studente2 = new Studente();
        studente2.setId(2);
        studente2.setNome("Micalelo");
        studente2.setCorso("Spring-boot");
        studenti.add(studente2);
    }

    //
    @Override
    public List<Studente> getAll() {
        return studenti;
    }
}

