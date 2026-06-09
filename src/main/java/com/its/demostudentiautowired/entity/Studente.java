package com.its.demostudentiautowired.entity;

public class Studente {
    private int id;
    private String nome;
    private String corso;

//COSTRUTTORE VUOTO PER ALTRI PARAMETRI
    public Studente (){
    }

//COSTRUTTORE PIENO E SERVE PER INIZIALIZZARE (COSTRUIRE) GLI OGGETTI
    public Studente (int id,String nome,String corso){
        this.id=id;
        this.nome=nome;
        this.corso=corso;
    }
//PRENDIAMO IL VALORE E LO RESTITUIAMO
    public int getId() {
        return id;
    }
//SETTIAMO O CAMBIAMO IL VALORE DOPO
    public void setId(int id) {
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCorso(){
        return corso;
    }
    public void setCorso(String corso){
        this.corso = corso;
    }
}
