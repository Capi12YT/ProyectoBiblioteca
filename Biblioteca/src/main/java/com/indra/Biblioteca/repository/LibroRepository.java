package com.indra.Biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indra.Biblioteca.model.Libro;


public interface LibroRepository extends JpaRepository<Libro, Long>{

}
