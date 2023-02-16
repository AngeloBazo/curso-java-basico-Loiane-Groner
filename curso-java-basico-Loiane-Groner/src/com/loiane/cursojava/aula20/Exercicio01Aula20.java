package com.loiane.cursojava.aula20;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio01Aula20 {

	public static void main(String[] args) {

		DecimalFormat formatador = new DecimalFormat("00");

		Random gerador = new Random();

		int[][] matrizA = new int[4][4];

		int maiorNumeroDaMatriz = 0;
		int linha = 0, coluna = 0;

		for (int i = 0; i < matrizA.length; i++) {

			for (int j = 0; j < matrizA[i].length; j++) {

				matrizA[i][j] = gerador.nextInt(100);

				if (maiorNumeroDaMatriz < matrizA[i][j]) {
					maiorNumeroDaMatriz = matrizA[i][j];
					linha = i;
					coluna = j;
					
				}

				System.out.print("[" + formatador.format(matrizA[i][j]) + "]");
			}

			System.out.println(" ");

		}

		System.out.println("O maior nª da matriz é : " + maiorNumeroDaMatriz);
		System.out.println("Ele está na linha " + (linha+1) + " e coluna " + (coluna+1));
	}

}
