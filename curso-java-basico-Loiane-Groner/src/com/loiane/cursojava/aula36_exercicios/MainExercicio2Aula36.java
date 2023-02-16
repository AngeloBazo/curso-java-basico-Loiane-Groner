package com.loiane.cursojava.aula36_exercicios;

import java.util.Scanner;

public class MainExercicio2Aula36 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Nome do curso");

		String nomeCurso = scan.nextLine();

		Curso novoCurso = new Curso();

		Aluno[] alunos = new Aluno[2];

		for (int i = 0; i < alunos.length; i++) {

			Aluno a = new Aluno();

			System.out.println("Entre com o nome do aluno");
			String nome = scan.nextLine();
			a.setNomeAluno(nome);

			System.out.println("Entre com a matricula do aluno");
			String matricula = scan.nextLine();
			a.setMatrícula(matricula);

			System.out.println("Entre com a 1º nota do aluno");
			a.setNota01(scan.nextDouble());

			System.out.println("Entre com a 2º nota do aluno");
			a.setNota02(scan.nextDouble());

			System.out.println("Entre com a 3º nota do aluno");
			a.setNota03(scan.nextDouble());

			System.out.println("Entre com a 4º nota do aluno");
			a.setNota04(scan.nextDouble());

			alunos[i] = a;

			System.out.println("Média final desse aluno : " +  a.obterMedia());

		}

		novoCurso.setAlunos(alunos);

		if (novoCurso != null) {
			System.out.println("agenda.obterInfo()");

			System.out.println();

		}

		for (int i = 0; i < alunos.length; i++) {
			
			System.out.println (alunos[i]);
		}
		
		
	}

}
