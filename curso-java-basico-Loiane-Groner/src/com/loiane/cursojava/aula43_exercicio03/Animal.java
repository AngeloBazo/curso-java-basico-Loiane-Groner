package com.loiane.cursojava.aula43_exercicio03;

public class Animal {

	private String nomeAnimal;
	private double comprimentoAnimal;
	private int patasAnimal;
	private String corAnimal;
	private String ambienteAnimal;
	private double velocidadeAnimal;

	public Animal() {
		
	}
	
	public Animal(String nomeAnimal, double comprimentoAnimal, String corAnimal, String ambienteAnimal,
			double velocidadeAnimal2) {
		this.nomeAnimal = nomeAnimal;
		this.comprimentoAnimal = comprimentoAnimal;
		this.patasAnimal = 4;
		this.corAnimal = corAnimal;
		this.ambienteAnimal = ambienteAnimal;
		this.velocidadeAnimal = velocidadeAnimal2;
	}
	
	
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
	public double getComprimentoAnimal() {
		return comprimentoAnimal;
	}
	public void setComprimentoAnimal(double comprimentoAnimal) {
		this.comprimentoAnimal = comprimentoAnimal;
	}
	public int getPatasAnimal() {
		return patasAnimal;
	}
	public void setPatasAnimal(int patasAnimal) {
		this.patasAnimal = patasAnimal;
	}
	public String getCorAnimal() {
		return corAnimal;
	}
	public void setCorAnimal(String corAnimal) {
		this.corAnimal = corAnimal;
	}
	public String getAmbienteAnimal() {
		return ambienteAnimal;
	}
	public void setAmbienteAnimal(String ambienteAnimal) {
		this.ambienteAnimal = ambienteAnimal;
	}
	
	public double getVelocidadeAnimal() {
		return velocidadeAnimal;
	}

	public void setVelocidadeAnimal(double velocidadeAnimal) {
		this.velocidadeAnimal = velocidadeAnimal;
	}

	@Override
	public String toString() {
		return "-----------------------\nAnimal: \t" + nomeAnimal + "\nComprimento: \t" + comprimentoAnimal + " cm \nPatas: \t\t"
				+ patasAnimal + "\nCor: \t\t" + corAnimal + "\nAmbiente: \t" + ambienteAnimal
				+ "\nVelocidade: \t" + velocidadeAnimal + " m/s";
	}
	
	
	
	
	
	
}
