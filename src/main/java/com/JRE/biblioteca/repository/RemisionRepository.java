package com.JRE.biblioteca.repository;

import com.JRE.biblioteca.entity.Remision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemisionRepository extends JpaRepository <Remision, Integer> {
}
