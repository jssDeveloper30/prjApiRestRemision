package com.JRE.biblioteca.service;

import com.JRE.biblioteca.RemisionApplication;
import com.JRE.biblioteca.entity.Remision;

import java.util.List;

public interface RemisionService  {
    Remision save(Remision remision);
    List<Remision> findAll();
    Remision findByID(Integer id);
    void deleteById(Integer id);
    Remision update(Remision remision);
}
