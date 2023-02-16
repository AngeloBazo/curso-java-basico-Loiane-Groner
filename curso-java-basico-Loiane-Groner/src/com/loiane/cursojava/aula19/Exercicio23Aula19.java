package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exercicio23Aula19 {

	public static void main(String[] args) {

		Random gerador = new Random();

		int[] vetorA = new int[10];

		System.out.println("Vetor A : ");

		for (int i = 0; i < vetorA.length; i++) {

			vetorA[i] = gerador.nextInt(50);

			if (!(vetorA[i] % 2 == 0))
				break;

			System.out.print(vetorA[i] + " - ");
		}

		System.out.println("\n--------------------------------------------");

	}
}
