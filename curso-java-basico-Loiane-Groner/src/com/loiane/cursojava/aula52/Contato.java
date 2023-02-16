package com.loiane.cursojava.aula52;

public class Contato {

	private String nome;
	private String telefone;
	private int identificador;
	public static int contador = 0;
	
	
	public Contato() {
		contador++;
		this.identificador = contador;

	}

	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdentificador() {
		return identificador;
	}




	@Override
	public String toString() {
		return "Contato \n[nome=" + nome + ", telefone=" + telefone + ", identificador=" + identificador + "]";
	}

	

}
