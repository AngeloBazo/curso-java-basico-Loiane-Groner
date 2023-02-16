package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exercicio06Aula20Jogador01 extends Exercicio06Aula20TabuleiroJogoVelha {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void jogadaJogador01() {

		System.out.print("\nJogador01 - onde deseja marcar seu X :");
		int opcaoJog01 = teclado.nextInt();
		switch (opcaoJog01) {
		case 1:
			Exercicio06Aula20TabuleiroJogoVelha.matriz00 = "X";
			break;
		case 2:
			Exercicio06Aula20TabuleiroJogoVelha.matriz01 = "X";
			break;
		case 3:
			Exercicio06Aula20TabuleiroJogoVelha.matriz02 = "X";
			break;
		case 4:
			Exercicio06Aula20TabuleiroJogoVelha.matriz10 = "X";
			break;
		case 5:
			Exercicio06Aula20TabuleiroJogoVelha.matriz11 = "X";
			break;
		case 6:
			Exercicio06Aula20TabuleiroJogoVelha.matriz12 = "X";
			break;
		case 7:
			Exercicio06Aula20TabuleiroJogoVelha.matriz20 = "X";
			break;
		case 8:
			Exercicio06Aula20TabuleiroJogoVelha.matriz21 = "X";
			break;
		case 9:
			Exercicio06Aula20TabuleiroJogoVelha.matriz22 = "X";
			break;
		default:
			System.out.println("Casa inválida");
			break;
		}

	}

}
