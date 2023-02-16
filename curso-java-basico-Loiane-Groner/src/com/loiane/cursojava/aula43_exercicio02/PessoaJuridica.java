package com.loiane.cursojava.aula43_exercicio02;

public class PessoaJuridica extends Contribuinte {

	
	private double rendimentoBruto;
	private double valorImpostoPJ;

	
	
	@Override
	public String toString() {
		return "PessoaJuridica: \t" + getNome() + 
				"\nRendimento Bruto: \t" + rendimentoBruto + ""
				+ "\nValor Imposto PJ\n(10% sobre bruto): \t" + valorImpostoPJ;
	}




	public void calcularImpostoPJ(double rendimentoBruto) {
	
	valorImpostoPJ = (rendimentoBruto /100) * 10;
			
	}
	
	
	
	
	public double getRendimentoBruto() {
		return rendimentoBruto;
	}

	public void setRendimentoBruto(double rendimentoBruto) {
		this.rendimentoBruto = rendimentoBruto;
	}




	public double getValorImpostoPJ() {
		return valorImpostoPJ;
	}




	public void setValorImpostoPJ(double valorImpostoPJ) {
		this.valorImpostoPJ = valorImpostoPJ;
	}
	
	
	
	
	
	
}
