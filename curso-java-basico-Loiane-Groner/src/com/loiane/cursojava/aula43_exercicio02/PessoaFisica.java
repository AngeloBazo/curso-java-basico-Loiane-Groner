package com.loiane.cursojava.aula43_exercicio02;

public class PessoaFisica extends Contribuinte {

	private double rendaPF;
	private double impostoPF;

	public void calcularImpostoPF(double rendimentoBruto) {

		if (rendimentoBruto >= 0 && rendimentoBruto < 1400) {

			impostoPF = 0;

		} else if (rendimentoBruto >= 1400.01 && rendimentoBruto < 2100){
			
			impostoPF = (rendimentoBruto / 100) * 10;
	
	} else
		impostoPF = (rendimentoBruto / 100) * 15;
	}
		

	public double getRendaPF() {
		return rendaPF;
	}

	public void setRendaPF(double rendaPF) {
		this.rendaPF = rendaPF;
	}

	public double getImpostoPF() {
		return impostoPF;
	}

	public void setImpostoPF(double impostoPF) {
		this.impostoPF = impostoPF;
	}

	
	@Override
	public String toString() {
		return "Pessoa Fisica: \t" + getNome() + "\nRenda PF: \t" + rendaPF + "\nImposto PF: \t" + impostoPF;
	}
	
	
}
