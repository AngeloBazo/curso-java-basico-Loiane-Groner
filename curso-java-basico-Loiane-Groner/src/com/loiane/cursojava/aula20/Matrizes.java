package com.loiane.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 8;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 6.5;
		notasAlunos[0][3] = 4.3;

		notasAlunos[1][0] = 5;
		notasAlunos[1][1] = 6;
		notasAlunos[1][2] = 7.5;
		notasAlunos[1][3] = 9.3;

		notasAlunos[2][0] = 6;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 7.5;
		notasAlunos[2][3] = 1.3;

		for (int i = 0; i < notasAlunos.length; i++) {

			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print("[" + notasAlunos[i][j] + "]");
			}

			System.out.println(" ");

		}

	}

}
