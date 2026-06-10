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

    @Override
    public String create(Studente studente) {
//CICLA PER VEDERE SE CI SONO DUPLICATI IN ID:
        if (studente.getId() > 0) {
            //PER OGNI Studente (studenteLista = singolo elemento all'interno della lista )
            // //ALL'INTERNO DELLA LISTA studenti...
            for (Studente studenteLista : studenti) {
                //FAMMI QUESTO:
                if (studente.getId().equals(studenteLista.getId()))
                    return "Impossibile registrare due studenti con lo stesso id.";
                }
            }
//LEGGE I DATI SCRITTI SU E FA I CONTROLLI PER QUANTO RIGUARDA I PARAMETRI
        if (studente.getNome() != null && studente.getCorso() != null && studente.getId() > 0) {
            studenti.add(studente);
            return "Studente aggiunto con successo.";
        } else
            return "Errore riscontrato.";
    }

}

