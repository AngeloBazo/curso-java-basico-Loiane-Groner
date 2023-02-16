package com.loiane.cursojava.aula20;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03Aula20 {

	public static void main(String[] args) {

		DecimalFormat formatador = new DecimalFormat("00");

		Scanner teclado = new Scanner(System.in);

		int[][] matrizA = new int[3][3];

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.println("Digite o nª inteiro (até 09) da linha " + i + " e da coluna " + j + ":");
				int valorDigitado = teclado.nextInt();
				matrizA[i][j] = valorDigitado;
			}
		}

		System.out.println("\nMatriz digitada pelo usuário:");

		for (int i = 0; i < matrizA.length; i++) {

			for (int j = 0; j < matrizA[i].length; j++) {

				System.out.print("[" + formatador.format(matrizA[i][j]) + "]");
			}

			System.out.println("");
		}

		System.out.println("Números pares da matriz:");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				if (matrizA[i][j] % 2 == 0) {
					System.out.print("[" + formatador.format(matrizA[i][j]) + "]");
				}
			}
		}

		System.out.println("");
		System.out.println("Números impares da matriz:");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				if (!(matrizA[i][j] % 2 == 0)) {
					System.out.print("[" + formatador.format(matrizA[i][j]) + "]");
				}
			}
		}

	}

}
