package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exercicio28Aula19 {

	public static void main(String[] args) {

		Random gerador = new Random();

		int[] vetorA = new int[10];

		int[] vetorB = new int[10];

		int i;

		System.out.println("Vetor A : ");

		for (i = 0; i < vetorA.length; i++) {
			vetorA[i] = gerador.nextInt(50);
			System.out.print(vetorA[i] + " - ");
		}

		System.out.println("\n------------------------------------------------");

		System.out.println("Vetor B : ");
		for (i = 9; i >= 0; i--) {

			vetorB[i] = vetorA[i];

			System.out.print(vetorB[i] + " ~ ");

		}

	}

}
