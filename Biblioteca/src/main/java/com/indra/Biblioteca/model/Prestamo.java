package com.indra.Biblioteca.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="prestamos")
public class Prestamo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Date inicio;
	
	private Date fin;
	
    @ManyToOne
    @JoinColumn(name = "fk_libro")
	private Libro libro;
    
    @ManyToOne
    @JoinColumn(name = "fk_lector")
	private Lector lector;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Lector getLector() {
		return lector;
	}

	public void setLector(Lector lector) {
		this.lector = lector;
	}

	public Prestamo(Long id, Date inicio, Date fin, Libro libro, Lector lector) {
		super();
		this.id = id;
		this.inicio = inicio;
		this.fin = fin;
		this.libro = libro;
		this.lector = lector;
	}

	public Prestamo() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
