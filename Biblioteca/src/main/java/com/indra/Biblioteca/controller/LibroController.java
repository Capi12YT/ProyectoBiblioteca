package com.indra.Biblioteca.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.indra.Biblioteca.model.Libro;
import com.indra.Biblioteca.model.TipoLibro;
import com.indra.Biblioteca.service.LibroService;

@Controller
public class LibroController {

	@Autowired
	private LibroService libroService;

	@GetMapping("/libro")
	public String viewHomePage(Model model) {

		model.addAttribute("libros", this.libroService.getAllLibros());
		return "libro";
	}

	@GetMapping("/add")
	public String viewAddPage(Model model) {
		
		model.addAttribute("libro", new Libro());
		return "add";
	}

	@PostMapping("/save")
	public String saveLibro(@ModelAttribute("libro") Libro libro) {
		// save Course to database
		this.libroService.saveLibro(libro);
		return "redirect:/libro";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteLibro(@PathVariable Long id) {
		this.libroService.deleteLibroById(id);
		return "redirect:/libro";
	}
	
	@GetMapping("/update/{id}")
	public String showFormForUpdate(@PathVariable Long id, Model model) {

		Libro libro = this.libroService.getLibroById(id);
		model.addAttribute("libro", libro);
		return "add";
	}
	
	
	@GetMapping("/lector")
	public String viewLectorPage(Model model) {

		// model.addAttribute("libros", this.libroService.getAllLibros());
		return "lector";
	}

	@GetMapping("/prestamo")
	public String viewPrestamoPage(Model model) {

		// model.addAttribute("libros", this.libroService.getAllLibros());
		return "prestamo";
	}

	@ModelAttribute("tipos")
	public List<TipoLibro> getListTipos(){
		List<TipoLibro> tiposLibros = new ArrayList<TipoLibro>();
		tiposLibros.add(TipoLibro.NOVELA);
		tiposLibros.add(TipoLibro.TEATRO);
		tiposLibros.add(TipoLibro.POESIA);
		tiposLibros.add(TipoLibro.ENSAYO);
		return tiposLibros;
	}
}
