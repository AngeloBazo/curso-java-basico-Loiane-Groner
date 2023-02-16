package com.loiane.cursojava.aula19;

public class Exercicio03Aula19 {

	public static void main(String[] args) {
	
		int[] vetorA = { 1, 2, 3, 4, 5 };

		int[] vetorB = new int[5];

		System.out.println("Vetor A : ");

		for (int i = 0; i < vetorA.length; i++) {

			vetorB[i] = vetorA[i] * vetorA[i] ;

			System.out.println(vetorA[i]);

		}

		System.out.println("Vetor B : ");

		for (int i = 0; i < vetorA.length; i++) {
		
			System.out.println(vetorB[i]);

		}


	}

}
