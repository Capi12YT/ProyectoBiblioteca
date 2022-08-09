package com.indra.Biblioteca.service;

import java.util.List;



import com.indra.Biblioteca.model.Libro;


public interface LibroService {
    List<Libro> getAllLibros();
    void saveLibro(Libro libro);
    Libro getLibroById(long id);
    void deleteLibroById(long id);
 
}
