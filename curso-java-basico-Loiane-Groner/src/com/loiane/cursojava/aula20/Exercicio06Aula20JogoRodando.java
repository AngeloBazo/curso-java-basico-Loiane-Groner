package com.loiane.cursojava.aula20;

public class Exercicio06Aula20JogoRodando {

	public static void jogoRodando()   {
			
		while (Exercicio06Aula20Ganhador.ganhador) {

			Exercicio06Aula20Jogador01.jogadaJogador01();

			Exercicio06Aula20TabuleiroJogoVelha.tabuleiroJogoVelha();
						
			Exercicio06Aula20Jogador02.jogadaJogador02();

			Exercicio06Aula20TabuleiroJogoVelha.tabuleiroJogoVelha();
		}

		System.out.println("Saiu do laço");

		}

	}
	
	

