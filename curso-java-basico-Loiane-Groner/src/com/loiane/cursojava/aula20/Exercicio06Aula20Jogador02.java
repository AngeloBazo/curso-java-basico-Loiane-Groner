package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exercicio06Aula20Jogador02 extends Exercicio06Aula20TabuleiroJogoVelha {

	public static Scanner teclado = new Scanner(System.in);

	public static void jogadaJogador02() {

		System.out.print("\nJogador02 - onde deseja marcar sua 0  :");

		int opcaoJog02 = teclado.nextInt();

		switch (opcaoJog02) {

		case 1:
			if (Exercicio06Aula20TabuleiroJogoVelha.matriz00 == "X") {
				System.out.println("Jogada inválida - casa já ocupada");
			} else {
				Exercicio06Aula20TabuleiroJogoVelha.matriz00 = "0";
			}
			break;

		case 2:
			Exercicio06Aula20TabuleiroJogoVelha.matriz01 = "0";
			break;
		case 3:
			Exercicio06Aula20TabuleiroJogoVelha.matriz02 = "0";
			break;
		case 4:
			Exercicio06Aula20TabuleiroJogoVelha.matriz10 = "0";
			break;
		case 5:
			Exercicio06Aula20TabuleiroJogoVelha.matriz11 = "0";
			break;
		case 6:
			Exercicio06Aula20TabuleiroJogoVelha.matriz12 = "0";
			break;
		case 7:
			Exercicio06Aula20TabuleiroJogoVelha.matriz20 = "0";
			break;
		case 8:
			Exercicio06Aula20TabuleiroJogoVelha.matriz21 = "0";
			break;
		case 9:
			Exercicio06Aula20TabuleiroJogoVelha.matriz22 = "0";
			break;
		default:
			System.out.println("Casa inválida");
			break;
		}

	}

}
