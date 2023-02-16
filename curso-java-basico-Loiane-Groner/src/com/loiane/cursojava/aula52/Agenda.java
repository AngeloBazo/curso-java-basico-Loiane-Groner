package com.loiane.cursojava.aula52;

import java.util.Arrays;

public class Agenda {

	private Contato[] contatos;

	public Agenda() {
		contatos = new Contato[5];
	}

	@Override
	public String toString() {
		return "Agenda [contatos=" + Arrays.toString(contatos) + "]";
	}

	
	
	
}
