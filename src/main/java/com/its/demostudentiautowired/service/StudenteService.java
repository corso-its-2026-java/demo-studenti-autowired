package com.its.demostudentiautowired.service;

import com.its.demostudentiautowired.entity.Studente;

import java.util.List;

public interface StudenteService {
    //FIRMA DEL METODO, OVVERO:
    List <Studente> getAll();
    // CREA UN NUOVO PACKAGE DENTRO IL SERVICE PER LE IMPLEMENTAZIONI "ServiceImpl"
    // E POI UNA CLASSE "StudenteServiceImpl"
}
