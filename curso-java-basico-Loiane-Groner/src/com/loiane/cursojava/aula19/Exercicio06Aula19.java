package com.loiane.cursojava.aula19;

public class Exercicio06Aula19 {

	public static void main(String[] args) {

		int[] vetorA = { 1, 2, 3, 4, 5, 25 };

		int[] vetorB = new int[vetorA.length];

		int[] vetorC = new int[vetorA.length];

		System.out.println("Vetor A : ");

		for (int i = 0; i < vetorA.length; i++) {

			vetorB[i] = vetorA[i] * i;

			System.out.println(vetorA[i]);

		}
		System.out.println("--------------------------");
		System.out.println("Vetor B : ");

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println(vetorB[i]);

		}

		System.out.println("--------------------------");
		System.out.println("Vetor C : soma de A e B ");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}

	}

}