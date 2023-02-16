package com.loiane.cursojava.aula47;

public class Excecoes {

	public static void main(String[] args) {

		try {

			int[] vetor = new int[4];

			System.out.println("Antes da exception");

			vetor[4] = 1; // erro

			System.out.println("Esse texto não será impresso");

		} catch (ArrayIndexOutOfBoundsException exception) {

			System.out.println("Msg após tratamento (alternativa) da exception");

		}

		System.out.println("O programa continua mesmo com o erro");

		
		System.out.println("--------------------------------");
		
		try {

			int[] vetor = new int[4];

			System.out.println("2 - Antes da exception");

			vetor[10] = 1; // erro

			System.out.println("2- Esse texto não será impresso");

		} catch (Throwable exception) {
			System.out.println("2- Msg após tratamento (alternativa) da exception");

		}

		System.out.println("2- O programa continua mesmo com o erro");

	}

		
	}

		

