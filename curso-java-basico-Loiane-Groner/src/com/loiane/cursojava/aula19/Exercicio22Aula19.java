package com.loiane.cursojava.aula19;

public class Exercicio22Aula19 {

	public static void main(String[] args) {

		int contDeZeros = 0;
		int contDeUns = 0;

		int[] vetorA = new int[10];

		System.out.println("Vetor A : ");
		
		for (int i = 0; i < vetorA.length; i++) {

			vetorA[i] = (int) Math.round(Math.random() * 1);

			if (vetorA[i] == 0) {

				contDeZeros += 1;
			} else {

				contDeUns += 1;
			}

			System.out.print(vetorA[i] + " - ");

		}
		System.out.println("");
		System.out.println("---------------------");
		
		System.out.println("Qtd de n no vetorA : 10 - que corresponde a 100%");
		
		System.out.println("Quantidade de zeros : " + contDeZeros + " - que corresponde a " + (double) contDeZeros/10*100 +  "%");

		System.out.println("Quantidade de uns : " + contDeUns + " - que corresponde a " + (double) contDeUns/10*100 +  "%");
	}

}
