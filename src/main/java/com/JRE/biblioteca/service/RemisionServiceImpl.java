package com.JRE.biblioteca.service;

import com.JRE.biblioteca.entity.Remision;
import com.JRE.biblioteca.repository.RemisionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RemisionServiceImpl implements RemisionService {

    private final RemisionRepository remisionRepository;

    public RemisionServiceImpl(RemisionRepository remisionRepository) {
        this.remisionRepository = remisionRepository;
    }

    @Override
    public Remision save(Remision remision) {
        return remisionRepository.save(remision);
    }

    @Override
    public List<Remision> findAll() {
        return List.of();
    }

    @Override
    public Remision findByID(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Remision update(Remision remision) {
        return null;
    }
}
