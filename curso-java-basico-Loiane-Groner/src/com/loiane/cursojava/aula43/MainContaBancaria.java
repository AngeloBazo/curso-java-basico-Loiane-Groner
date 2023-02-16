package com.loiane.cursojava.aula43;

import java.util.Calendar;
import java.util.Scanner;

public class MainContaBancaria {

	public static void main(String[] args) {

		ContaPoupanca PoupancaCliente01 = null;
		ContaEspecial EspecialCliente01 = null;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Qual tipo de conta deseja abrir? " + "\n1) Conta Poupança " + "\n2) Conta Especial");

		int tipoContaDigitada = teclado.nextInt();

		if (tipoContaDigitada == 1) {

			PoupancaCliente01 = new ContaPoupanca();

		} else if ((tipoContaDigitada == 2)) {

			EspecialCliente01 = new ContaEspecial("Angelo LFB", "555-9", 0, 1500);

		} else
			System.out.println("Não existe o tipo de conta digitada");

		if (tipoContaDigitada == 1) {
			System.out.println("CONTA POUPANÇA ABERTA!!!");
		}

		else if (tipoContaDigitada == 2) {

			System.out.println("");
			System.out.println("!!! CONTA ESPECIAL ABERTA !!!");
			System.out.println("");

			System.out.println(EspecialCliente01.toString());

			System.out.println("");
			System.out.println("Cliente deposita: 1.000");
			EspecialCliente01.depositar(1000);
			System.out.println(" Saldo atual: \t" + EspecialCliente01.getSaldo());
			System.out.println(" Limite atual: \t" + EspecialCliente01.getLimite());

			System.out.println("");
			System.out.println("Cliente saca: 500");
			EspecialCliente01.sacar(500);
			System.out.println(" Saldo atual: \t" + EspecialCliente01.getSaldo());
			System.out.println(" Limite atual: \t" + EspecialCliente01.getLimite());

			System.out.println("");
			System.out.println("Cliente saca: 450");
			EspecialCliente01.sacar(450);
			System.out.println(" Saldo atual: \t" + EspecialCliente01.getSaldo());
			System.out.println(" Limite atual: \t" + EspecialCliente01.getLimite());

			System.out.println("");
			System.out.println("Cliente tenta sacar: 3000");
			EspecialCliente01.sacar(3000);
			System.out.println(" Saldo atual: \t" + EspecialCliente01.getSaldo());
			System.out.println(" Limite atual: \t" + EspecialCliente01.getLimite());

			System.out.println("");
			System.out.println("Cliente saca: 50");
			EspecialCliente01.sacar(50);
			System.out.println(" Saldo atual: \t" + EspecialCliente01.getSaldo());
			System.out.println(" Limite atual: \t" + EspecialCliente01.getLimite());

			System.out.println("");
			System.out.println("Cliente saca: 300");
			EspecialCliente01.sacar(300);
			System.out.println(" Saldo atual: \t" + EspecialCliente01.getSaldo());
			System.out.println(" Limite atual: \t" + EspecialCliente01.getLimite());

			System.out.println("");
			System.out.println("Cliente deposita: 1.000");
			EspecialCliente01.depositar(1000);
			System.out.println(" Saldo atual: \t" + EspecialCliente01.getSaldo());
			System.out.println(" Limite atual: \t" + EspecialCliente01.getLimite());

		}


		Calendar hoje = Calendar.getInstance();
				
		System.out.println(Calendar.DAY_OF_WEEK);
	
	}

}
