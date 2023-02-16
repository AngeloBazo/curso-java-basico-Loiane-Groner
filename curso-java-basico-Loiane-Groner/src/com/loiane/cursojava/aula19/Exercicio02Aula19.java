package com.loiane.cursojava.aula19;

public class Exercicio02Aula19 {

	public static void main(String[] args) {

		int[] vetorA = { 1, 2, 3, 4, 5,6,7,8 };

		int[] vetorB = new int[8];

		System.out.println("Vetor A : ");

		for (int i = 0; i < vetorA.length; i++) {

			vetorB[i] = vetorA[i] * 2;

			System.out.println(vetorA[i]);

		}

		System.out.println("Vetor B : ");

		for (int i = 0; i < vetorA.length; i++) {
		
			System.out.println(vetorB[i]);

		}


	}

}
