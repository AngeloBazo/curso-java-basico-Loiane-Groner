package com.loiane.cursojava.aula27;

import java.util.Scanner;

public class Exercicio03Aula27Main {

	public static void main(String[] args) {
					
		Scanner teclado = new Scanner(System.in);

		Aluno aluno01 = new Aluno();

		System.out.println(
				"Ver a média de qual a disciplina:"
				+ " " + "\n" + aluno01.getIngles() + "\n" + aluno01.getPortugues() + "\n" + aluno01.getMatematica());

		System.out.println("");
		System.out.println("Aluno 01 - digite sua 1ª nota:");

		double nota01 = teclado.nextDouble();

		System.out.println("Aluno 01 - digite sua 2ª nota:");

		double nota02 = teclado.nextDouble();

		System.out.println("Aluno 01 - digite sua 3ª nota:");

		double nota03 = teclado.nextDouble();

		aluno01.verificarAprovacao(nota01, nota02, nota03);

	}

}
