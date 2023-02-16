package com.loiane.cursojava.aula19;

import java.text.DecimalFormat;

public class Exercicio15Aula19 {

	public static void main(String[] args) {

		DecimalFormat formatador = new DecimalFormat("0.00");
				
		int[] vetorA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		double soma = 0;
		int impar = 0;
		int par = 0;

		for (int i = 0; i < vetorA.length; i++) {

			soma = vetorA[i] + soma;

			if (vetorA[i] % 2 == 0) {

				par = vetorA[i] + par;

			} else {

				impar = vetorA[i] + impar;

			}

		}

		System.out.println("Soma de todos n do vetor : " + soma + " = 100 %");
		System.out.println("");
		
		System.out.println("Soma dos n pares : " + par + " = " + formatador.format((par/soma*100))  + " %");
		System.out.println("");
		
		System.out.println("Soma dos n impares : " + impar + " = " + (impar/soma*100) + " %");

	}

}
