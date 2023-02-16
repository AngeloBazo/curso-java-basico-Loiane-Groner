package com.loiane.cursojava.aula20;

public class Exercicio06Aula20TabuleiroJogoVelha {

	public static String matriz00 = "1";
	public static String matriz01 = "2";
	public static String matriz02 = "3";
	public static String matriz10 = "4";
	public static String matriz11 = "5";
	public static String matriz12 = "6";
	public static String matriz20 = "7";
	public static String matriz21 = "8";
	public static String matriz22 = "9";

	public static void tabuleiroJogoVelha() {

		String[][] matrizA = new String[3][3];

		matrizA[0][0] = matriz00;
		matrizA[0][1] = matriz01;
		matrizA[0][2] = matriz02;
		matrizA[1][0] = matriz10;
		matrizA[1][1] = matriz11;
		matrizA[1][2] = matriz12;
		matrizA[2][0] = matriz20;
		matrizA[2][1] = matriz21;
		matrizA[2][2] = matriz22;

		System.out.println("\nTabuleiro - jogo da velha :");

		for (int i = 0; i < matrizA.length; i++) {

			for (int j = 0; j < matrizA[i].length; j++) {

				System.out.print("[" + matrizA[i][j] + "]");
			}

			System.out.println("");
		}

		if (

		(Exercicio06Aula20TabuleiroJogoVelha.matriz00.equals("X")
				&& Exercicio06Aula20TabuleiroJogoVelha.matriz01.equals("X")
				&& Exercicio06Aula20TabuleiroJogoVelha.matriz02.equals("X"))

				||

				(Exercicio06Aula20TabuleiroJogoVelha.matriz10.equals("X")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz11.equals("X")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz12.equals("X"))
				||

				(Exercicio06Aula20TabuleiroJogoVelha.matriz20.equals("X")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz21.equals("X")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz22.equals("X"))

				||

				(Exercicio06Aula20TabuleiroJogoVelha.matriz00.equals("X")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz10.equals("X")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz20.equals("X"))

				||

				(Exercicio06Aula20TabuleiroJogoVelha.matriz01.equals("X")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz11.equals("X")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz21.equals("X"))

				||

				(Exercicio06Aula20TabuleiroJogoVelha.matriz02.equals("X")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz12.equals("X")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz22.equals("X"))

				||

				(Exercicio06Aula20TabuleiroJogoVelha.matriz00.equals("X")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz11.equals("X")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz22.equals("X"))

				||

				(Exercicio06Aula20TabuleiroJogoVelha.matriz20.equals("X")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz11.equals("X")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz02.equals("X"))

		) {

			Exercicio06Aula20Ganhador.ganhador = false;
			System.out.println("!!! JOGADOR 01 - CAMPEÃO !!!");

		}

		else if ((Exercicio06Aula20TabuleiroJogoVelha.matriz00.equals("0")
				&& Exercicio06Aula20TabuleiroJogoVelha.matriz01.equals("0")
				&& Exercicio06Aula20TabuleiroJogoVelha.matriz02.equals("0"))

				||

				(Exercicio06Aula20TabuleiroJogoVelha.matriz10.equals("0")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz11.equals("0")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz12.equals("0"))
				||

				(Exercicio06Aula20TabuleiroJogoVelha.matriz20.equals("0")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz21.equals("0")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz22.equals("0"))

				||

				(Exercicio06Aula20TabuleiroJogoVelha.matriz00.equals("0")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz10.equals("0")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz20.equals("0"))

				||

				(Exercicio06Aula20TabuleiroJogoVelha.matriz01.equals("0")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz11.equals("0")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz21.equals("0"))

				||

				(Exercicio06Aula20TabuleiroJogoVelha.matriz02.equals("0")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz12.equals("0")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz22.equals("0"))

				||

				(Exercicio06Aula20TabuleiroJogoVelha.matriz00.equals("0")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz11.equals("0")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz22.equals("0"))

				||

				(Exercicio06Aula20TabuleiroJogoVelha.matriz20.equals("0")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz11.equals("0")
						&& Exercicio06Aula20TabuleiroJogoVelha.matriz02.equals("0"))

		) {
			Exercicio06Aula20Ganhador.ganhador = false;
			System.out.println(">>> CAMPEÃO - JOGADOR 02 !!! <<<");
		}

	
	
	}

}
