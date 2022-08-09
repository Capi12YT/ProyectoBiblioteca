package com.indra.Biblioteca.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="lectores")
public class Lector {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long nSocio;
	
	private String nombre;
	
	private String telefono;
	
	private String direccion;
	
	@OneToMany
	@JoinColumn(name = "fk_lector")
	private List<Prestamo> prestamos;

	public Long getnSocio() {
		return nSocio;
	}

	public void setnSocio(Long nSocio) {
		this.nSocio = nSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public Lector(Long nSocio, String nombre, String telefono, String direccion, List<Prestamo> prestamos) {
		super();
		this.nSocio = nSocio;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.prestamos = prestamos;
	}

	public Lector() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
