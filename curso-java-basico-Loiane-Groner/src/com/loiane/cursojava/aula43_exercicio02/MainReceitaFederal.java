package com.loiane.cursojava.aula43_exercicio02;

import java.util.Scanner;

public class MainReceitaFederal {

	public static void main(String[] args) {

		PessoaJuridica pj01 = new PessoaJuridica();
		PessoaFisica pf01 = new PessoaFisica();

		Scanner teclado = new Scanner(System.in);

		System.out.println("Bem vindo - vamos pagar seu imposto??? O leão te espera!!!");
		System.out.println("");
		System.out.println("Digite: \n1) para P. Jurídica  \n2) para P. Física");

		int opcaoDigitada = teclado.nextInt();

		if (opcaoDigitada == 1) {

			System.out.println("Digite o nome da PJ:");

			pj01.setNome(teclado.next());

			System.out.println("Digite o rendimento bruto para cálculo do imposto:");

			pj01.setRendimentoBruto(teclado.nextDouble());

			pj01.calcularImpostoPJ(pj01.getRendimentoBruto());

			System.out.println(pj01.toString());
		}

		else if (opcaoDigitada == 2) {
		
			System.out.println("Digite o nome da PF:");

			pf01.setNome(teclado.next());

			System.out.println("Digite o rendimento bruto para cálculo do imposto:");

			pf01.setRendaPF(teclado.nextDouble());

			pf01.calcularImpostoPF(pf01.getRendaPF());

			System.out.println(pf01.toString());
			
		}

		else
			System.out.println("Não existe a opção digitada");

	}

}
