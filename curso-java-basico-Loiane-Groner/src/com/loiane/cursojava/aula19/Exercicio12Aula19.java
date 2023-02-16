package com.loiane.cursojava.aula19;

public class Exercicio12Aula19 {

	public static void main(String[] args) {

		int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int soma = 0;

		for (int i = 0; i < vetorA.length; i++) {

			soma = vetorA[i] + soma;
		}

		
		System.out.println(soma);
	}
}
