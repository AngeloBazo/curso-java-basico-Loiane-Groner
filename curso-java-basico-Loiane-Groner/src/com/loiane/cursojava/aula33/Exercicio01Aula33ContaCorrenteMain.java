package com.loiane.cursojava.aula33;

import java.util.Scanner;

public class Exercicio01Aula33ContaCorrenteMain {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double valorSaque;
		double valorDeposito;
		int opcaoMenu01 = 1;

		Exercicio01Aula33ContaCorrente cliente01 = new Exercicio01Aula33ContaCorrente("Angelo Bazo", 15544, 1000.00,
				1500.00);

		System.out.println(cliente01.toString());
		System.out.println("");

		while (opcaoMenu01 == 1) {

			System.out.println("Qual operação defesa efetuar: \n1) Sacar \n2) Depositar \n3) Saldo na tela");

			int opcaoDigitada = teclado.nextInt();

			if (opcaoDigitada == 1) {

				System.out.println("Qual valor deseja sacar:");

				valorSaque = teclado.nextDouble();

				cliente01.realizarSaque(valorSaque);

			} else if (opcaoDigitada == 2) {

				System.out.println("Qual valor deseja depositar:");

				valorDeposito = teclado.nextDouble();

				cliente01.depositarDinheiro(valorDeposito);

			} else if (opcaoDigitada == 3) {

				System.out.println(

						"\nSaldo atual CC = " + cliente01.getSaldoCC() + "\nLimite cheque especial = "
								+ cliente01.getLimiteCC() + "\nSaldo + limite = "
								+ (cliente01.getSaldoCC() + cliente01.getLimiteCC()) + "\nUtilizando cheque especial = "
								+ cliente01.isEspecial());

			} else {
				System.out.println("Opção inválida");
			}

			System.out.println("");

			System.out.println(cliente01.toString());

			System.out.println("");
			System.out.println("Deseja efetuar nova operação? 1) sim / 2) não ");

			opcaoMenu01 = teclado.nextInt();

		}
		
		System.out.println("Fim do programa - obrigado por utilizar nossos serviços!!!");

	}
}
