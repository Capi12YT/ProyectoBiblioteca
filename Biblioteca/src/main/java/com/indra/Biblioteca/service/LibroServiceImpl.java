package com.indra.Biblioteca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.Biblioteca.model.Libro;
import com.indra.Biblioteca.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService{

	@Autowired
	private LibroRepository libroRepository;
	
	
	@Override
	public List<Libro> getAllLibros() {
		// TODO Auto-generated method stub
		return libroRepository.findAll();
	}

	@Override
	public void saveLibro(Libro libro) {
		// TODO Auto-generated method stub
		this.libroRepository.save(libro);
	}

	@Override
	public Libro getLibroById(long id) {
		// TODO Auto-generated method stub
		Optional<Libro> optionalLibro = this.libroRepository.findById(id);
		Libro libro = null;
		if (optionalLibro.isPresent()){
			libro = optionalLibro.get();
		} else{
			throw new RuntimeException("Libro not found for id : " + id);
		}
		
		return libro;
	}

	@Override
	public void deleteLibroById(long id) {
		// TODO Auto-generated method stub
		this.libroRepository.deleteById(id);
		
	}

}
