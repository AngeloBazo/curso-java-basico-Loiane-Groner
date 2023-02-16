package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class Exercicio06Aula20 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Exercicio06Aula20Jogador01 jog01 = new Exercicio06Aula20Jogador01();
		Exercicio06Aula20Jogador02 jog02 = new Exercicio06Aula20Jogador02();

		System.out.println("===== O JOGO VAI COMEÇAR =====");

		Exercicio06Aula20TabuleiroJogoVelha.tabuleiroJogoVelha();

		Exercicio06Aula20JogoRodando.jogoRodando();	
			
	}

}
