package com.loiane.cursojava.aula43_exercicio03;

public class Mamifero extends Animal {

	private String alimentoMamifero;
		

	public Mamifero(String nomeAnimal, double comprimentoAnimal, String corAnimal, String ambienteAnimal,
			
			double velocidadeAnimal2, String alimentoMamifero) {
		
		super(nomeAnimal, comprimentoAnimal, corAnimal, ambienteAnimal, velocidadeAnimal2);
		
		this.alimentoMamifero = alimentoMamifero;
	
	}

	public String getAlimentoMamifero() {
		return alimentoMamifero;
	}

	public void setAlimentoMamifero(String alimentoMamifero) {
		this.alimentoMamifero = alimentoMamifero;
	}
	

	
}
