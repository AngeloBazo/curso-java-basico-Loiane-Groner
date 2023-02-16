package com.loiane.cursojava.aula20;

import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio02Aula20 {

	public static void main(String[] args) {

		DecimalFormat formatador = new DecimalFormat("00");

		Random gerador = new Random();

		int[][] matrizA = new int[10][10];

		int maiorNumeroDaMatrizLinha5 = 0;
		int menorNumeroDaMatrizLinha5 = 99999;
		int linha = 0, coluna = 0;

		System.out.println("Matriz completa 10 x 10:");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				matrizA[i][j] = gerador.nextInt(100);
				System.out.print("[" + formatador.format(matrizA[i][j]) + "]");
			}
			System.out.println(" ");
		}

		System.out.println("\nLinha 5 da Matriz 10x10:");
		for (int i = 5; i <= 5; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				if (maiorNumeroDaMatrizLinha5 < matrizA[i][j]) {
					maiorNumeroDaMatrizLinha5 = matrizA[i][j];
					linha = i;
					coluna = j;
				}
				if (menorNumeroDaMatrizLinha5 > matrizA[i][j]) {
					menorNumeroDaMatrizLinha5 = matrizA[i][j];
				}

				System.out.print("[" + formatador.format(matrizA[i][j]) + "]");
			}
			System.out.println(" ");
		}

		System.out.println("\nO maior nª da linha 5 matriz é : " + maiorNumeroDaMatrizLinha5);
		System.out.println("Ele está na linha " + (linha) + " e coluna " + (coluna));
		System.out.println("O menor nª da linha 5 matriz é : " + menorNumeroDaMatrizLinha5);

	}

}
