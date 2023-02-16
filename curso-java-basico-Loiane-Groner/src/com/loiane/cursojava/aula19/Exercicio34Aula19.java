package com.loiane.cursojava.aula19;

import java.util.Random;

public class Exercicio34Aula19 {
	

	public static void main(String[] args) {

		Random gerador = new Random();

		int[] vetorA = new int[10];

		int i, x;

		System.out.println("Vetor A : ");

		for (i = 0; i < vetorA.length; i++) {

			vetorA[i] = gerador.nextInt(20);

			System.out.println("");
			System.out.println("------------------------");
			System.out.println(vetorA[i]);

			for (x = 0; x <= vetorA[i]; x++) {
				//System.out.print(x + "-");
				if (x % 2 == 0) {
				System.out.print(x + " ~ " );	
				}
				
			}

		}

		System.out.println("\n------------------------------------------------");

	}

}
