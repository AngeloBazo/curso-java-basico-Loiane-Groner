package com.loiane.cursojava.aula33;

public class Exercicio01Aula33Lampada {

	private boolean lampadaLigada;
	
	
	public void ligarLampada() {
	
		lampadaLigada = true;
		
	}


	public Exercicio01Aula33Lampada(boolean lampadaLigada) {
		this.lampadaLigada = lampadaLigada;
	}


	public boolean isLampadaLigada() {
		return lampadaLigada;
	}


	public void setLampadaLigada(boolean lampadaLigada) {
		this.lampadaLigada = lampadaLigada;
	}
	
	
	
	
	
	
}
