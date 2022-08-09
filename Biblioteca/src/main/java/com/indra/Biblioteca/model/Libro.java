package com.indra.Biblioteca.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="libros")
public class Libro {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	
	private TipoLibro tipo;
	
	private String editorial;
	
	private int anyo;

	private int cantidad;
	
	@Column(name="nombre_autor")
	private String AutorNombre;
	
	@Column(name="nacionalidad_autor")
	private String NacionalidadAutor;
	
	@Column(name="fecha_nacimiento_autor")
	private Date FechaNacAutor;

	@OneToMany
	@JoinColumn(name = "fk_libro")
	private List<Prestamo> prestamos;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoLibro getTipo() {
		return tipo;
	}

	public void setTipo(TipoLibro tipo) {
		this.tipo = tipo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getAutorNombre() {
		return AutorNombre;
	}

	public void setAutorNombre(String autorNombre) {
		AutorNombre = autorNombre;
	}

	public String getNacionalidadAutor() {
		return NacionalidadAutor;
	}

	public void setNacionalidadAutor(String nacionalidadAutor) {
		NacionalidadAutor = nacionalidadAutor;
	}

	public String getFechaNacAutor() {
		return FechaNacAutor.toString();
	}

	public void setFechaNacAutor(String fechaNacAutor) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date fechaAux = null;
		try {
			fechaAux = sdf.parse(fechaNacAutor);
			FechaNacAutor = fechaAux;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public Libro(Long id, String nombre, TipoLibro tipo, String editorial, int anyo, int cantidad, String autorNombre,
			String nacionalidadAutor, Date fechaNacAutor, List<Prestamo> prestamos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.editorial = editorial;
		this.anyo = anyo;
		this.cantidad = cantidad;
		AutorNombre = autorNombre;
		NacionalidadAutor = nacionalidadAutor;
		FechaNacAutor = fechaNacAutor;
		this.prestamos = prestamos;
	}

	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
