package com.indra.Biblioteca.model;

public enum TipoLibro {

	NOVELA(0), TEATRO(1), POESIA(2), ENSAYO(3);

	private int value;

	private TipoLibro(int value){
		this.value = value; }

}
