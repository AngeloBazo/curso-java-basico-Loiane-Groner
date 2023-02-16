package com.loiane.cursojava.aula43_exercicio03;

public class Peixe extends Animal {

	private String caracteristicasPeixe;
	private int patasAnimal;

			
	public Peixe(String nomeAnimal, double comprimentoAnimal, int patasAnimal, String corAnimal, String ambienteAnimal,

			double velocidadeAnimal, String caracteristicasPeixe) {
		
		super(nomeAnimal, comprimentoAnimal, corAnimal, ambienteAnimal, velocidadeAnimal);
		
		this.caracteristicasPeixe = caracteristicasPeixe;
		this.patasAnimal = patasAnimal;
	}

	

	public String getCaracteristicasPeixe() {
		return caracteristicasPeixe;
	}

	public void setCaracteristicasPeixe(String caracteristicasPeixe) {
		this.caracteristicasPeixe = caracteristicasPeixe;
	}

	public int getPatasAnimal() {
		return patasAnimal;
	}

	public void setPatasAnimal(int patasAnimal) {
		this.patasAnimal = patasAnimal;
	}



	@Override
	public String toString() {
		return "-----------------------\nAnimal: \t" + getNomeAnimal() +
				"\nComprimento: \t" + getComprimentoAnimal() +
				"\nPatas: \t\t" + patasAnimal +
				"\nCor: \t\t" + getCorAnimal()+
				"\nAmbiente: \t" + getAmbienteAnimal() +
				"\nVelocidade: \t" + getVelocidadeAnimal()+
				"\nCaracterística: " + this.caracteristicasPeixe;
						 }

	
	
}
